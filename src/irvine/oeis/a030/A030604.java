package irvine.oeis.a030;

import irvine.math.z.Z;
import irvine.oeis.a000.A000045;

/**
 * A030604 Write the Fibonacci numbers in base 6 and juxtapose.
 * @author Sean A. Irvine
 */
public class A030604 extends A000045 {

  private String mF = super.next().toString(6);
  private int mPos = -1;

  @Override
  public Z next() {
    if (++mPos >= mF.length()) {
      mF = super.next().toString(6);
      mPos = 0;
    }
    return Z.valueOf(mF.charAt(mPos) - '0');
  }
}

