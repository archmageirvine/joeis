package irvine.oeis.a188;

import irvine.oeis.a010.A010842;
import irvine.oeis.transform.InverseInvertTransform;

/**
 * A188143 Binomial transform of A187848.
 * @author Georg Fischer
 */
public class A188143 extends InverseInvertTransform {

  /** Construct the sequence. */
  public A188143() {
    super(0, new A010842(), 1);
    next();
  }
}
