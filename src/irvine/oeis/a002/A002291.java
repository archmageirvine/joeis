package irvine.oeis.a002;

import irvine.oeis.AbsoluteSequence;
import irvine.oeis.a225.A225872;

/**
 * A002291 Absolute value of Glaisher's beta'(2n+1).
 * @author Sean A. Irvine
 */
public class A002291 extends AbsoluteSequence {

  /** Construct the sequence. */
  public A002291() {
    super(new A225872());
  }
}
