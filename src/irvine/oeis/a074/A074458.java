package irvine.oeis.a074;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A074458 Number of segments lit to display the number n on a 7-segment display (as in pocket <code>calculators)</code>: variant where <code>'6', '7'</code> and <code>'9'</code> use <code>6, 4</code> resp. 5 segments.
 * @author Sean A. Irvine
 */
public class A074458 implements Sequence {

  private static final long[] DIGIT_COUNTS = {6, 2, 5, 5, 4, 5, 6, 4, 7, 5};
  private long mN = -1;

  @Override
  public Z next() {
    long m = ++mN;
    long c = 0;
    do {
      c += DIGIT_COUNTS[(int) (m % 10)];
      m /= 10;
    } while (m != 0);
    return Z.valueOf(c);
  }
}
