package irvine.oeis.a101;

import irvine.math.z.Z;
import irvine.oeis.InverseBinomialTransformSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a007.A007322;

/**
 * A101370.
 * @author Sean A. Irvine
 */
public class A101370 extends InverseBinomialTransformSequence {

  /** Construct the sequence. */
  public A101370() {
    super(new PrependSequence(new A007322(), Z.ZERO), 0);
    next();
  }
}
