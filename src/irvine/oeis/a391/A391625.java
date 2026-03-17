package irvine.oeis.a391;

import irvine.math.function.Functions;
import irvine.oeis.a381.A381498;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A391625 allocated for Michael De Vlieger.
 * @author Sean A. Irvine
 */
public class A391625 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A391625() {
    super(1, new A381498(), Functions.SQUARE_FREE_KERNEL::z);
  }
}
