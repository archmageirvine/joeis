package irvine.oeis.a095;

import irvine.oeis.a000.A000670;
import irvine.oeis.transform.InverseInvertTransform;

/**
 * A095989 INVERTi transform applied to the ordered Bell numbers.
 * @author Georg Fischer
 */
public class A095989 extends InverseInvertTransform {

  /** Construct the sequence. */
  public A095989() {
    super(1, new A000670(), 1);
  }
}
