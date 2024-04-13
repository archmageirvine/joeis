package irvine.oeis.a066;

import irvine.math.function.Functions;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A066585 Product of nonzero digits of A066555(n).
 * @author Sean A. Irvine
 */
public class A066585 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A066585() {
    super(1, new A066555(), k -> Functions.DIGIT_NZ_PRODUCT.z(10, k));
  }
}
