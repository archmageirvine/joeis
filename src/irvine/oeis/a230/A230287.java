package irvine.oeis.a230;

import irvine.oeis.DifferenceSequence;

/**
 * A230287 First differences of A016052/3 (= A230286).
 * @author Georg Fischer
 */
public class A230287 extends DifferenceSequence {

  /** Construct the sequence. */
  public A230287() {
    super(1, new A230286());
  }

}
