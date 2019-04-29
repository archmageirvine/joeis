package irvine.oeis.a020;

import irvine.oeis.DifferenceSequence;
import irvine.oeis.RecordSequence;
import irvine.oeis.a005.A005117;

/**
 * A020753.
 * @author Sean A. Irvine
 */
public class A020753 extends RecordSequence {

  /** Construct the sequence. */
  public A020753() {
    super(new DifferenceSequence(new A005117()));
  }
}

