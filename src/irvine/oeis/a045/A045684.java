package irvine.oeis.a045;

import irvine.oeis.transform.MobiusTransformSequence;

/**
 * A045684 Number of 2n-bead balanced binary necklaces of fundamental period 2n which are inequivalent to their reverse, complement and reversed complement.
 * @author Sean A. Irvine
 */
public class A045684 extends MobiusTransformSequence {

  /** Construct the sequence. */
  public A045684() {
    super(new A045675(), 1);
  }
}

