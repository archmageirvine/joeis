package irvine.oeis.a046;

import irvine.oeis.RunLengthSequence;

/**
 * A046876 Length of runs in the sequence of row/column periods of Sprague-Grundy values of Wythoff's Game (A046875).
 * @author Sean A. Irvine
 */
public class A046876 extends RunLengthSequence {

  /** Construct the sequence. */
  public A046876() {
    super(new A046875());
  }
}
