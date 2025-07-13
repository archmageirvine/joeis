package irvine.oeis.a385;

import java.util.LinkedList;
import java.util.TreeSet;

import irvine.math.function.Functions;
import irvine.math.group.SymmetricGroup;
import irvine.math.polynomial.CycleIndex;
import irvine.math.polynomial.MultivariateMonomial;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A385081 Irregular triangle T(n,k) of refined derangement counts in the symmetric group S_(n+1), refined per cycle type.
 * @author Sean A. Irvine
 */
public class A385081 extends Sequence1 {

  private int mN = 1;
  private final LinkedList<Z> mA = new LinkedList<>();

  @Override
  public Z next() {
    if (mA.isEmpty()) {
      final CycleIndex z = SymmetricGroup.create(++mN).cycleIndex().drop(1);
      z.multiply(Q.valueOf(Functions.FACTORIAL.z(mN)));
      //System.out.println(z);
      for (final MultivariateMonomial mm : new TreeSet<>(z.values())) {
        mA.add(mm.getCoefficient().toZ());
      }
    }
    return mA.pollLast();
  }
}
