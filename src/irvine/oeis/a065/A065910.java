package irvine.oeis.a065;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A065904.
 * @author Sean A. Irvine
 */
public class A065910 extends A000040 {

  private final long mTarget;

  protected A065910(final long target) {
    mTarget = target;
  }

  /** Construct the sequence. */
  public A065910() {
    this(3);
  }

  private Z is(final Z p) {
    Z soln = null;
    long cnt = 0;
    for (Z x = Z.TWO; x.compareTo(p) < 0; x = x.add(1)) {
      if (x.modPow(Z.FOUR, p).equals(Z.TWO)) {
        if (++cnt == 2) {
          soln = x;
        }
        if (cnt >= mTarget) {
          return soln;
        }
      }
    }
    return null;
  }

  @Override
  public Z next() {
    while (true) {
      final Z r = is(super.next());
      if (r != null) {
        return r;
      }
    }
  }
}
