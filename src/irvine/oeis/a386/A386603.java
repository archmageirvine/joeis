package irvine.oeis.a386;

import irvine.math.function.Functions;
import irvine.oeis.InverseSequence;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A386603 allocated for Felix Huber.
 * @author Sean A. Irvine
 */
public class A386603 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A386603() {
    super(0, new InverseSequence(0, 0, new A386600()), Functions.PRIME::z);
  }
}
