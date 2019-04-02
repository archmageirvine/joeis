package irvine.oeis.a006;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006048 Number of entries in first n rows of Pascal's triangle not divisible by 3.
 * @author Sean A. Irvine
 */
public class A006048 implements Sequence {

  private long mC = 0;
  private long mRow = -1;

  @Override
  public Z next() {
    ++mRow;
    for (long col = 0; col <= mRow; ++col) {
      if (Binomial.binomial(mRow, col).mod(3) != 0) {
        ++mC;
      }
    }
    return Z.valueOf(mC);
  }
}
