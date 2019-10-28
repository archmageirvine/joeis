package irvine.oeis.a036;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A036566 Numbers of form <code>7^i*8^j</code> with i, j <code>&gt;= 0</code>, sorted.
 * @author Sean A. Irvine
 */
public class A036566 implements Sequence {

  private final TreeSet<Z> mPriority = new TreeSet<>();
  {
    mPriority.add(Z.ONE);
  }

  @Override
  public Z next() {
    final Z r = mPriority.pollFirst();
    mPriority.add(r.multiply(7));
    mPriority.add(r.multiply(8));
    return r;
  }
}
