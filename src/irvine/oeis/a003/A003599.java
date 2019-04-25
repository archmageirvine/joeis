package irvine.oeis.a003;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A003599 Numbers of the form <code>7^i*11^j</code>.
 * @author Sean A. Irvine
 */
public class A003599 implements Sequence {

  private final TreeSet<Z> mPriority = new TreeSet<>();
  {
    mPriority.add(Z.ONE);
  }

  @Override
  public Z next() {
    final Z r = mPriority.pollFirst();
    mPriority.add(r.multiply(7));
    mPriority.add(r.multiply(11));
    return r;
  }
}
