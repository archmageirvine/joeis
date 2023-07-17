package irvine.oeis.a048;

import irvine.math.z.Z;
import irvine.oeis.a001.A001203;

/**
 * A048294 2-digit terms in the continued fraction for Pi.
 * @author Sean A. Irvine
 */
public class A048294 extends A001203 {

  /** Construct the sequence. */
  public A048294() {
    super(1);
  }

  private static final Z UPPER = Z.valueOf(100);

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      if (t.compareTo(Z.TEN) >= 0 && t.compareTo(UPPER) < 0) {
        return t;
      }
    }
  }
}
