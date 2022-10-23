package irvine.oeis.a033;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A033851 Numbers whose prime factors are 5 and 7.
 * @author Sean A. Irvine
 */
public class A033851 extends Sequence1 {

  private final TreeSet<Z> mPriority = new TreeSet<>();
  {
    mPriority.add(Z.valueOf(35));
  }

  @Override
  public Z next() {
    final Z r = mPriority.pollFirst();
    mPriority.add(r.multiply(5));
    mPriority.add(r.multiply(7));
    return r;
  }
}
