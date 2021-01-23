package irvine.oeis.a025;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A025617 Numbers of form 4^i*5^j, with i, j &gt;= 0.
 * @author Sean A. Irvine
 */
public class A025617 implements Sequence {

  private final TreeSet<Z> mPriority = new TreeSet<>();
  {
    mPriority.add(Z.ONE);
  }

  @Override
  public Z next() {
    final Z r = mPriority.pollFirst();
    mPriority.add(r.multiply(4));
    mPriority.add(r.multiply(5));
    return r;
  }
}
