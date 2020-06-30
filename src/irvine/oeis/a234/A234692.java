package irvine.oeis.a234;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A234692 Decimal value of the bitmap of active segments in 7-segment display of the number n, variant <code>2 ("abcdefg"</code> scheme: bits represent segments in clockwise order).
 * @author Georg Fischer
 */
public class A234692 implements Sequence {

  private static final Z[] DIGIT_COUNTS = {
    Z.valueOf(63),
    Z.valueOf(6),
    Z.valueOf(91),
    Z.valueOf(79),
    Z.valueOf(102),
    Z.valueOf(109),
    Z.valueOf(125),
    Z.valueOf(39),
    Z.valueOf(127),
    Z.valueOf(111),
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
