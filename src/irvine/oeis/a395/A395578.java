package irvine.oeis.a395;

import irvine.math.function.Functions;
import irvine.oeis.a303.A303606;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A395578 allocated for Michael De Vlieger.
 * @author Sean A. Irvine
 */
public class A395578 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A395578() {
    super(new A303606(), Functions.SQUARE_FREE_KERNEL::z);
  }
}
