package irvine.oeis.a045;

import irvine.oeis.transform.MobiusTransformSequence;

/**
 * A045687 Number of 2n-bead balanced binary necklaces of fundamental period 2n which are equivalent to their reversed complement, but are not equivalent to their reverse and complement.
 * @author Sean A. Irvine
 */
public class A045687 extends MobiusTransformSequence {

  /** Construct the sequence. */
  public A045687() {
    super(0, new A045678(), 1);
  }
}

