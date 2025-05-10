package irvine.oeis.a077;

import irvine.math.function.Functions;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A077176 Largest squarefree number that divides A077175(n).
 * @author Sean A. Irvine
 */
public class A077176 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A077176() {
    super(1, new A077175(), Functions.SQUARE_FREE_KERNEL::z);
  }
}

