package irvine.oeis.a070;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A070021 1/n has period 1 in base 10 (but not terminating).
 * @author Sean A. Irvine
 */
public class A070021 extends Sequence1 {

  private final TreeSet<Z> mPriority = new TreeSet<>();
  {
    mPriority.add(Z.THREE);
    mPriority.add(Z.NINE);
  }

  @Override
  public Z next() {
    final Z r = mPriority.pollFirst();
    mPriority.add(r.multiply2());
    mPriority.add(r.multiply(5));
    return r;
  }
}
