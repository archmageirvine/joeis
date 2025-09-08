package irvine.oeis.a080;

import irvine.math.z.Z;
import irvine.oeis.a002.A002144;

/**
 * A080167 Primes beginning with '10' and ending with '01' in binary representation.
 * @author Sean A. Irvine
 */
public class A080167 extends A002144 {

  private final long mPrefix;

  protected A080167(final long prefix) {
    mPrefix = prefix;
  }

  /** Construct the sequence. */
  public A080167() {
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

