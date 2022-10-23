package irvine.oeis.a003;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A003598 Numbers of the form 5^i * 11^j.
 * @author Sean A. Irvine
 */
public class A003598 extends Sequence1 {

  private final TreeSet<Z> mPriority = new TreeSet<>();
  {
    mPriority.add(Z.ONE);
  }

  @Override
  public Z next() {
    final Z r = mPriority.pollFirst();
    mPriority.add(r.multiply(5));
    mPriority.add(r.multiply(11));
    return r;
  }
}
