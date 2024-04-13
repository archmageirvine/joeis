package irvine.oeis.a066;

import irvine.math.function.Functions;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A066581 Product of nonzero digits of A066547(n).
 * @author Sean A. Irvine
 */
public class A066581 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A066581() {
    super(1, new A066547(), k -> Functions.DIGIT_NZ_PRODUCT.z(10, k));
  }
}
