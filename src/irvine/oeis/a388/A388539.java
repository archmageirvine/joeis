package irvine.oeis.a388;

import irvine.math.function.Functions;
import irvine.oeis.a000.A000045;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A388539 Sum of decimal digits of Fibonacci(n)^2.
 * @author Sean A. Irvine
 */
public class A388539 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A388539() {
    super(0, new A000045(), f -> Functions.DIGIT_SUM.z(f.square()));
  }
}
