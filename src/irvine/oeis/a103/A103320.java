package irvine.oeis.a103;

import irvine.oeis.FiniteSequence;

/**
 * A103320 Condensed Golomb sequence: digits according to Golomb's sequence, same digits concatenated.
 * @author Georg Fischer
 */
public class A103320 extends FiniteSequence {

  /** Construct the sequence. */
  public A103320() {
    super(1, 22, 33, 444, 555, 6666, 7777, 8888, 99999);
  }
}
