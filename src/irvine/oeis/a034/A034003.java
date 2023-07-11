package irvine.oeis.a034;

import irvine.oeis.a007.A007890;
import irvine.oeis.base.DigitSequence;

/**
 * A034003 A007890 expanded into single digits.
 * @author Sean A. Irvine
 */
public class A034003 extends DigitSequence {

  /** Construct the sequence. */
  public A034003() {
    super(0, new A007890());
  }
}
