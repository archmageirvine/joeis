package irvine.oeis.a077;

import irvine.math.function.Functions;
import irvine.oeis.a007.A007908;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A077694 a(n) = triangular number whose index is the concatenation of the first n natural numbers.
 * @author Sean A. Irvine
 */
public class A077694 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A077694() {
    super(1, new A007908(), Functions.TRIANGULAR::z);
  }
}
