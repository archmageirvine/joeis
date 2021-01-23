package irvine.oeis.a334;

import irvine.math.z.Z;
import irvine.oeis.a000.A000796;

/**
 * A334754 The size of partitions of the decimal digits of Pi, starting directly after the decimal point, such that each partition contains the maximum number of digits possible while also avoiding any repeated digits. A digit must be in a partition if the current partition does not contain the current digit.
 * @author Sean A. Irvine
 */
public class A334754 extends A000796 {

  {
    super.next(); // skip 3
  }
  private int mNextDigit = super.next().intValue();

  @Override
  public Z next() {
    long syndrome = 0;
    int c = 0;
    while ((syndrome & (1 << mNextDigit)) == 0) {
      syndrome |= 1 << mNextDigit;
      ++c;
      mNextDigit = super.next().intValue();
    }
    return Z.valueOf(c);
  }
}

