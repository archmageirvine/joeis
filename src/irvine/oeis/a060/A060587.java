package irvine.oeis.a060;

import irvine.oeis.InverseSequence;

/**
 * A060587 A ternary code: inverse of A060583.
 * @author Sean A. Irvine
 */
public class A060587 extends InverseSequence {

  /** Construct the sequence. */
  public A060587() {
    super(0, new A060583(), 0, 0);
  }
}
