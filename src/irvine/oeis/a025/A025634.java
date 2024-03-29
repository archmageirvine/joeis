package irvine.oeis.a025;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A025634 Numbers of form 8^i*10^j, with i, j &gt;= 0.
 * @author Sean A. Irvine
 */
public class A025634 extends Sequence1 {

  private final TreeSet<Z> mPriority = new TreeSet<>();
  {
    mPriority.add(Z.ONE);
  }

  @Override
  public Z next() {
    final Z r = mPriority.pollFirst();
    mPriority.add(r.multiply(8));
    mPriority.add(r.multiply(10));
    return r;
  }
}
