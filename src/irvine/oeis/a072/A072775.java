package irvine.oeis.a072;

import irvine.math.function.Functions;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A072775 Squarefree kernels of powers of squarefree numbers.
 * @author Sean A. Irvine
 */
public class A072775 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A072775() {
    super(1, new A072774(), Functions.SQUARE_FREE_KERNEL::z);
  }
}
