package irvine.oeis.a070;

import irvine.oeis.RecordSequence;

/**
 * A070926 Records in the Conway's alimentary function A070871.
 * @author Sean A. Irvine
 */
public class A070926 extends RecordSequence {

  /** Construct the sequence. */
  public A070926() {
    super(1, new A070871());
  }
}
