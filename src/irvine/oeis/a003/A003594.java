package irvine.oeis.a003;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A003594 Numbers of the form <code>3^i*7^j</code> with <code>i, j &gt;= 0</code>.
 * @author Sean A. Irvine
 */
public class A003594 implements Sequence {

  private final TreeSet<Z> mPriority = new TreeSet<>();
  {
    mPriority.add(Z.ONE);
  }

  @Override
  public Z next() {
    final Z r = mPriority.pollFirst();
    mPriority.add(r.multiply(3));
    mPriority.add(r.multiply(7));
    return r;
  }
}
