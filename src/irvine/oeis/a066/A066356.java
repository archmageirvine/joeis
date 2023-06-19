package irvine.oeis.a066;

import irvine.math.z.Z;
import irvine.oeis.a064.A064184;

/**
 * A066356 Numerator of sequence defined by recursion c(n) = 1 + c(n-2) / c(n-1), c(0) = 0, c(1) = 1.
 * @author Sean A. Irvine
 */
public class A066356 extends A064184 {

  @Override
  public Z next() {
    return mRationalSequence.nextQ().num();
  }
}
