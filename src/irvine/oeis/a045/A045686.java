package irvine.oeis.a045;

import irvine.oeis.transform.MobiusTransformSequence;

/**
 * A045686 Number of 2n-bead balanced binary necklaces of fundamental period 2n which are equivalent to their complement, but not equivalent to their reverse and their reversed complement.
 * @author Sean A. Irvine
 */
public class A045686 extends MobiusTransformSequence {

  /** Construct the sequence. */
  public A045686() {
    super(0, new A045677(), 1);
  }
}

