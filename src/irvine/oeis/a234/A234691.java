package irvine.oeis.a234;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A234691 Decimal value of the bitmap of active segments in 7-segment display of the number n, variant <code>1</code>: bits 0-6 refer to segments from top to bottom, left to right.
 * @author Sean A. Irvine
 */
public class A234691 implements Sequence {

  private static final Z[] DIGIT_COUNTS = {
    Z.valueOf(119),
    Z.valueOf(36),
    Z.valueOf(93),
    Z.valueOf(109),
    Z.valueOf(46),
    Z.valueOf(107),
    Z.valueOf(123),
    Z.valueOf(39),
    Z.valueOf(127),
    Z.valueOf(111)
  };
  private long mN = -1;

  @Override
  public Z next() {
    long m = ++mN;
    Z c = Z.ZERO;
    int s = 0;
    do {
      c = c.add(DIGIT_COUNTS[(int) (m % 10)].shiftLeft(s));
      m /= 10;
      s += 7;
    } while (m != 0);
    return c;
  }
}
