package irvine.oeis.a025;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A025624 Numbers of form 5^i*9^j, with i, j &gt;= 0.
 * @author Sean A. Irvine
 */
public class A025624 extends Sequence1 {

  private final TreeSet<Z> mPriority = new TreeSet<>();
  {
    mPriority.add(Z.ONE);
  }

  @Override
  public Z next() {
    final Z r = mPriority.pollFirst();
    mPriority.add(r.multiply(5));
    mPriority.add(r.multiply(9));
    return r;
  }
}
