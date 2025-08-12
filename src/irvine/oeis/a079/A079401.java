package irvine.oeis.a079;

import irvine.oeis.PartialSumSequence;

/**
 * A072283 Number of raised dots to represent n in Braille.
 * @author Sean A. Irvine
 */
public class A079401 extends PartialSumSequence {

  /** Construct the sequence. */
  public A079401() {
    super(1, new A079399());
  }
}
