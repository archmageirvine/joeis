package irvine.oeis.a039;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A039942 Number of points needed to display n on the LCD (liquid-crystal display) of a TI-83 calculator.
 * @author Sean A. Irvine
 */
public class A039942 implements Sequence {

  private static final long[] POINTS = {19, 10, 14, 14, 14, 17, 15, 11, 17, 15};
  private long mN = -1;

  @Override
  public Z next() {
    long m = ++mN;
    long s = 0;
    do {
      s += POINTS[(int) (m % 10)];
      m /= 10;
    } while (m != 0);
    return Z.valueOf(s);
  }
}
