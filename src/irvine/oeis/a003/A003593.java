package irvine.oeis.a003;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A003593.
 * @author Sean A. Irvine
 */
public class A003593 implements Sequence {

  private final TreeSet<Z> mPriority = new TreeSet<>();
  {
    mPriority.add(Z.ONE);
  }

  @Override
  public Z next() {
    final Z r = mPriority.pollFirst();
    mPriority.add(r.multiply(3));
    mPriority.add(r.multiply(5));
    return r;
  }
}
