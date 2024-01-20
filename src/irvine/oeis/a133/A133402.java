package irvine.oeis.a133;

import irvine.oeis.a006.A006588;
import irvine.oeis.transform.HankelTransformSequence;

/**
 * A133402 Hankel transform of A006588.
 * @author Georg Fischer
 */
public class A133402 extends HankelTransformSequence {

  /** Construct the sequence. */
  public A133402() {
    super(0, new A006588());
    next();
  }
}
