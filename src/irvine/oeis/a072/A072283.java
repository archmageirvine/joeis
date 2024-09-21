package irvine.oeis.a072;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A072283 Number of raised dots to represent n in Braille.
 * @author Sean A. Irvine
 */
public class A072283 extends Sequence0 {

  private static final int[] BRAILLE = {3, 1, 2, 2, 3, 2, 3, 4, 3, 2};
  private long mN = -1;

  @Override
  public Z next() {
    long m = ++mN;
    long s = 4;
    do {
      s += BRAILLE[(int) (m % 10)];
      m /= 10;
    } while (m != 0);
    return Z.valueOf(s);
  }
}
