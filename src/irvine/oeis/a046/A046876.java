package irvine.oeis.a046;

import irvine.oeis.RunLengthSequence;

/**
 * A046876 From row/column periods of Sprague-Grundy values of Wythoff's Game.
 * @author Sean A. Irvine
 */
public class A046876 extends RunLengthSequence {

  /** Construct the sequence. */
  public A046876() {
    super(new A046875());
  }
}
