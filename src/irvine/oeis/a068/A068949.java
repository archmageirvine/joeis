package irvine.oeis.a068;

import irvine.math.function.Functions;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A068949 Digit sums of A068809.
 * @author Sean A. Irvine
 */
public class A068949 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A068949() {
    super(1, new A068809(), k -> Functions.DIGIT_SUM.z(k));
  }
}

