package irvine.oeis.a101;

import irvine.math.z.Z;
import irvine.oeis.PrependSequence;
import irvine.oeis.a007.A007322;
import irvine.oeis.transform.InverseBinomialTransformSequence;

/**
 * A101370 Number of zero-one matrices with n ones and no zero rows or columns.
 * @author Sean A. Irvine
 */
public class A101370 extends InverseBinomialTransformSequence {

  /** Construct the sequence. */
  public A101370() {
    super(1, new PrependSequence(new A007322(), Z.ZERO), 0);
    next();
  }
}
