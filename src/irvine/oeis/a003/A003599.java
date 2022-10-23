package irvine.oeis.a003;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A003599 Numbers of the form 7^i*11^j.
 * @author Sean A. Irvine
 */
public class A003599 extends Sequence1 {

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
