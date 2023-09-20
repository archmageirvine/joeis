package irvine.oeis.a065;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A065911 Third solution mod p of x^4 = 2 for primes p such that more than two solution exists.
 * @author Sean A. Irvine
 */
public class A065911 extends A000040 {

  private final long mTarget;

  protected A065911(final long target) {
    mTarget = target;
  }

  /** Construct the sequence. */
  public A065911() {
    this(3);
  }

  private Z is(final Z p) {
    long cnt = 0;
    for (Z x = Z.TWO; x.compareTo(p) < 0; x = x.add(1)) {
      if (x.modPow(Z.FOUR, p).equals(Z.TWO) && ++cnt >= mTarget) {
        return x;
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
