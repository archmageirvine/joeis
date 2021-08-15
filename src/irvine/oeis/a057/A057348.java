package irvine.oeis.a057;
// manually 2021-08-15

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A057348 Days in months in the Islamic calendar starting from Muharram, 1 AH. The twelfth month has 30 days in a leap year.
 * a(n)=if(n%2, 30, n%12, 29, (n/12*11+14)%30<11, 30, 29)
 * @author Georg Fischer
 */
public class A057348 implements Sequence {

  protected int mN;

  /**
   * Construct the sequence.
   */
  public A057348() {
    mN = 0;
  }

  @Override
  public Z next() {
    ++mN;
    if (mN % 2 != 0) {
      return Z.valueOf(30);
    } else if (mN % 12 != 0) {
      return Z.valueOf(29);
    } else if ((mN / 12 * 11 + 14) % 30 < 11) {
      return Z.valueOf(30);
    } else {
      return Z.valueOf(29);
    }
  }
}
