package irvine.oeis.a025;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A025632 Numbers of form 7^i*10^j, with i, j &gt;= 0.
 * @author Sean A. Irvine
 */
public class A025632 implements Sequence {

  private final TreeSet<Z> mPriority = new TreeSet<>();
  {
    mPriority.add(Z.ONE);
  }

  @Override
  public Z next() {
    final Z r = mPriority.pollFirst();
    mPriority.add(r.multiply(7));
    mPriority.add(r.multiply(10));
    return r;
  }
}
