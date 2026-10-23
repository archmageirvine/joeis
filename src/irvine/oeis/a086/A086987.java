package irvine.oeis.a086;

import irvine.math.function.Functions;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A086987 a(n) = A000203(A086986(n)).
 * @author Sean A. Irvine
 */
public class A086987 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A086987() {
    super(1, new A086986(), Functions.SIGMA1::z);
  }
}

