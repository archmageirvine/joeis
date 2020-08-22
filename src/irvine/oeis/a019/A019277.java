package irvine.oeis.a019;

import irvine.oeis.RecordSequence;

/**
 * A019277 Records in A019294, number of iterations of the sigma function to reach a multiple of the starting value.
 * @author Sean A. Irvine
 */
public class A019277 extends RecordSequence {

  /** Construct the sequence. */
  public A019277() {
    super(new A019294());
  }
}

