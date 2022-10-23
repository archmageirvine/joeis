package irvine.oeis.a025;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A025615 Numbers of form 3^i*8^j, with i, j &gt;= 0.
 * @author Sean A. Irvine
 */
public class A025615 extends Sequence1 {

  private final TreeSet<Z> mPriority = new TreeSet<>();
  {
    mPriority.add(Z.ONE);
  }

  @Override
  public Z next() {
    final Z r = mPriority.pollFirst();
    mPriority.add(r.multiply(3));
    mPriority.add(r.multiply(8));
    return r;
  }
}
