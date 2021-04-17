package irvine.oeis.a071;

import irvine.oeis.SkipSequence;
import irvine.oeis.a046.A046695;

/**
 * A071433 Sprague-Grundy values for octal game .37.
 * @author Sean A. Irvine
 */
public class A071433 extends SkipSequence {

  /** Construct the sequence. */
  public A071433() {
    super(new A046695(), 2);
  }
}
