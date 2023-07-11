package irvine.oeis.a045;

import irvine.oeis.transform.MobiusTransformSequence;

/**
 * A045685 Number of 2n-bead balanced binary necklaces of fundamental period 2n which are equivalent to their reverse, but not equivalent to their complement and reversed complement.
 * @author Sean A. Irvine
 */
public class A045685 extends MobiusTransformSequence {

  /** Construct the sequence. */
  public A045685() {
    super(0, new A045676(), 1);
  }
}

