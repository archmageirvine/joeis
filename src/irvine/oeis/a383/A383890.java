package irvine.oeis.a383;

import irvine.oeis.DifferenceSequence;
import irvine.oeis.RecordPositionSequence;
import irvine.oeis.a002.A002202;

/**
 * A383890 Index of record gaps between totient numbers.
 * @author Sean A. Irvine
 */
public class A383890 extends RecordPositionSequence {

  /** Construct the sequence. */
  public A383890() {
    super(1, 1, new DifferenceSequence(new A002202()));
  }
}
