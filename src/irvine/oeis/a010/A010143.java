package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A010143 Continued fraction for sqrt(58).
 * @author Sean A. Irvine
 */
public class A010143 extends PrependSequence {

  /** Construct the sequence. */
  public A010143() {
    super(new PeriodicSequence(1, 1, 1, 1, 1, 1, 14), Z.SEVEN);
  }
}

