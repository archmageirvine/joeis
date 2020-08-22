package irvine.oeis.a034;

import irvine.oeis.DigitSequence;
import irvine.oeis.a007.A007890;

/**
 * A034003 A007890 expanded into single digits.
 * @author Sean A. Irvine
 */
public class A034003 extends DigitSequence {

  /** Construct the sequence. */
  public A034003() {
    super(new A007890());
  }
}
