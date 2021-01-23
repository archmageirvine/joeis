package irvine.oeis.a025;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A025626 Numbers of form 6^i*7^j, with i, j &gt;= 0.
 * @author Sean A. Irvine
 */
public class A025626 implements Sequence {

  private final TreeSet<Z> mPriority = new TreeSet<>();
  {
    mPriority.add(Z.ONE);
  }

  @Override
  public Z next() {
    final Z r = mPriority.pollFirst();
    mPriority.add(r.multiply(6));
    mPriority.add(r.multiply(7));
    return r;
  }
}
