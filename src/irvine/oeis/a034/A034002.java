package irvine.oeis.a034;

import irvine.oeis.DigitSequence;
import irvine.oeis.a005.A005150;

/**
 * A034002 A005150 expanded into single digits.
 * @author Sean A. Irvine
 */
public class A034002 extends DigitSequence {

  /** Construct the sequence. */
  public A034002() {
    super(new A005150());
  }
}
