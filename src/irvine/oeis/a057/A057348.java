package irvine.oeis.a057;
// manually 2021-08-15

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A057348 Days in months in the Islamic calendar starting from Muharram, 1 AH. The twelfth month has 30 days in a leap year.
 * <code>a(n)=if(n%2, 30, n%12, 29, (n/12*11+14)%30&lt;11, 30, 29)</code>
 * @author Georg Fischer
 */
public class A057348 extends Sequence1 {

  protected int mN;

  /** Construct the sequence. */
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
