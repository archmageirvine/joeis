package irvine.oeis.a052;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A052293 Numbers of the form 11 + x^2 + x or 11 + 2*x^2.
 * @author Sean A. Irvine
 */
public class A052293 implements Sequence {

  private final TreeSet<Z> mA = new TreeSet<>();
  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (mA.isEmpty() || mA.first().compareTo(mN.square().add(mN).add(11)) >= 0) {
      final Z n2 = mN.square();
      mA.add(n2.add(mN).add(11));
      mA.add(n2.multiply2().add(11));
      mN = mN.add(1);
    }
    return mA.pollFirst();
  }
}
