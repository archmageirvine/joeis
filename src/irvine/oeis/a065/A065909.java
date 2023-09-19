package irvine.oeis.a065;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A065904.
 * @author Sean A. Irvine
 */
public class A065909 extends A000040 {

  private final long mTarget;

  protected A065909(final long target) {
    mTarget = target;
  }

  /** Construct the sequence. */
  public A065909() {
    this(3);
  }

  private Z is(final Z p) {
    Z first = null;
    long cnt = 0;
    for (Z x = Z.TWO; x.compareTo(p) < 0; x = x.add(1)) {
      if (x.modPow(Z.FOUR, p).equals(Z.TWO)) {
        if (first == null) {
          first = x;
        }
        if (++cnt >= mTarget) {
          return first;
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
