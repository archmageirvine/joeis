package irvine.oeis.a080;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A080165 Primes having initial digits "10" in binary representation.
 * @author Sean A. Irvine
 */
public class A080165 extends A000040 {

  private final long mPrefix;

  protected A080165(final long prefix) {
    mPrefix = prefix;
  }

  /** Construct the sequence. */
  public A080165() {
    this(2);
  }

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      long p1 = p.longValueExact();
      while (p1 > mPrefix) {
        p1 >>>= 1;
      }
      if (p1 == mPrefix) {
        return p;
      }
    }
  }
}

