package irvine.oeis.a086;

import irvine.math.function.Functions;
import irvine.oeis.a087.A087732;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A086916 Number of digits in terms of A087732.
 * @author Sean A. Irvine
 */
public class A086916 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A086916() {
    super(1, new A087732(), k -> Functions.DIGIT_LENGTH.z(k));
  }
}
