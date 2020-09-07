package irvine.oeis.a334;

import irvine.math.z.Z;
import irvine.oeis.a000.A000796;

/**
 * A334754 allocated for Ryan Brooks.
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

