package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.a000.A000364;

/**
 * A014547 n-th Euler (secant, zig) number A000364(n) is prime.
 * @author Sean A. Irvine
 */
public class A014547 extends A000364 {

  /** Construct the sequence. */
  public A014547() {
    super(1);
  }

  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final Z s = super.next();
      if (s.isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
