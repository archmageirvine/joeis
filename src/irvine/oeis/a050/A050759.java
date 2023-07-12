package irvine.oeis.a050;

import irvine.math.z.Z;
import irvine.oeis.a000.A000217;

/**
 * A050759 Numbers k such that the decimal expansion of (k^2 + k)/2 (the k-th triangular number) contains no pair of consecutive equal digits.
 * @author Sean A. Irvine
 */
public class A050759 extends A000217 {

  /** Construct the sequence. */
  public A050759() {
    super(1);
  }

  @Override
  public Z next() {
    outer:
    while (true) {
      Z t = super.next();
      Z r = Z.NEG_ONE;
      do {
        final Z[] qr = t.divideAndRemainder(Z.TEN);
        if (qr[1].equals(r)) {
          continue outer;
        }
        r = qr[1];
        t = qr[0];
      } while (!t.isZero());
      return Z.valueOf(mN);
    }
  }
}

