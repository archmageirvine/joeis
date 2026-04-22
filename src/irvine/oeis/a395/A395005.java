package irvine.oeis.a395;

import irvine.math.z.Z;
import irvine.oeis.FilterNumberSequence;
import irvine.oeis.a003.A003418;

/**
 * A395005 allocated for Zhicheng Wei.
 * @author Sean A. Irvine
 */
public class A395005 extends FilterNumberSequence {

  private static final A003418 A003418 = new A003418();

  /** Construct the sequence. */
  public A395005() {
    super(1, k -> {
      final Z z = Z.valueOf(k);
      long i = 1;
      Z fi = A003418.a(1);
      while (true) {
        for (long j = 1; j <= i; ++j) {
          final Z[] qr = fi.divideAndRemainder(j);
          if (qr[1].isZero() && qr[0].equals(z)) {
            return true;
          }
        }
        if (fi.divide(i).compareTo(2 * k) > 0) {
          return false;
        }
        fi = A003418.a(++i);
      }
    });
  }
}
