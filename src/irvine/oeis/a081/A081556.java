package irvine.oeis.a081;

import irvine.math.z.Z;
import irvine.oeis.a080.A080504;

/**
 * A081556 Next-to-last term in n-th row of A080504.
 * @author Sean A. Irvine
 */
public class A081556 extends A080504 {

  {
    setOffset(2);
    step();
  }

  @Override
  public Z next() {
    step();
    return mRow[mRow.length - 2];
  }
}

