package irvine.oeis.a033;

import irvine.oeis.InverseSequence;

/**
 * A033152 Position of first occurrence of n in the continued fraction for Niven's constant.
 * @author Sean A. Irvine
 */
public class A033152 extends InverseSequence {

  /** Construct the sequence. */
  public A033152() {
    super(1, new A033151(), 1);
  }
}
