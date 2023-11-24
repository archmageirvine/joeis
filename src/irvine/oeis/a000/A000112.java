package irvine.oeis.a000;

import irvine.oeis.PosetsSequence;

/**
 * A000112 Number of partially ordered sets ("posets") with n unlabeled elements.
 * @author Sean A. Irvine
 */
public class A000112 extends PosetsSequence {

  /** Construct the sequence. */
  public A000112() {
    super(0, g -> true);
  }
}
