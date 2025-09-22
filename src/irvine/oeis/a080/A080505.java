package irvine.oeis.a080;

import irvine.math.z.Z;

/**
 * A080505 Last term in n-th row of A080504.
 * @author Sean A. Irvine
 */
public class A080505 extends A080504 {

  @Override
  public Z next() {
    step();
    return mRow[mRow.length - 1];
  }
}

