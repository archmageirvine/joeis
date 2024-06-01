package irvine.oeis.a070;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A070022 1/n has period 2 in base 10.
 * @author Sean A. Irvine
 */
public class A070022 extends Sequence1 {

  private final TreeSet<Z> mPriority = new TreeSet<>();
  {
    mPriority.add(Z.valueOf(11));
    mPriority.add(Z.valueOf(33));
    mPriority.add(Z.valueOf(99));
  }

  @Override
  public Z next() {
    final Z r = mPriority.pollFirst();
    mPriority.add(r.multiply2());
    mPriority.add(r.multiply(5));
    return r;
  }
}
