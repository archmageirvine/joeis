package irvine.oeis.a392;

import irvine.math.function.Functions;
import irvine.oeis.a101.A101686;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A392465 Sum of decimal digits of A101686.
 * @author Sean A. Irvine
 */
public class A392465 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A392465() {
    super(0, new A101686(), k -> Functions.DIGIT_SUM.z(k));
  }
}
