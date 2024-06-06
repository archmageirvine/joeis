package irvine.oeis.a070;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.a000.A000009;

/**
 * A070235 Number of partitions of 3^n into distinct terms.
 * @author Sean A. Irvine
 */
public class A070235 extends A070231 {

  private Z mN = null;
  private final DirectSequence mA = new A000009();

  @Override
  public Z next() {
    mN = mN == null ? Z.ONE : mN.multiply(3);
    return mA.a(mN);
  }
}

