package irvine.oeis.a230;

import irvine.oeis.DifferenceSequence;
import irvine.oeis.SequenceWithOffset;

/**
 * A230287 First differences of A016052/3 (= A230286).
 * @author Georg Fischer
 */
public class A230287 extends DifferenceSequence implements SequenceWithOffset {

  /** Construct the sequence. */
  public A230287() {
    super(new A230286());
  }

  @Override
  public int getOffset() {
    return 1;
  }
}
