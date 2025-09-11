package irvine.oeis.a080;

import irvine.oeis.DifferenceSequence;
import irvine.oeis.RecordSequence;
import irvine.oeis.a002.A002858;

/**
 * A080288 Successively larger gaps between Ulam numbers.
 * @author Sean A. Irvine
 */
public class A080288 extends RecordSequence {

  /** Construct the sequence. */
  public A080288() {
    super(1, new DifferenceSequence(new A002858()));
  }
}

