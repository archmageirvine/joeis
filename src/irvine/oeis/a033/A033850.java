package irvine.oeis.a033;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A033850 Numbers whose prime factors are 3 and 7.
 * @author Sean A. Irvine
 */
public class A033850 implements Sequence {

  private final TreeSet<Z> mPriority = new TreeSet<>();
  {
    mPriority.add(Z.valueOf(21));
  }

  @Override
  public Z next() {
    final Z r = mPriority.pollFirst();
    mPriority.add(r.multiply(3));
    mPriority.add(r.multiply(7));
    return r;
  }
}
