package irvine.oeis.a033;

import irvine.oeis.InverseSequence;

/**
 * A033261 Position of first occurrence of n in the continued fraction for the Laplace's limit constant.
 * @author Sean A. Irvine
 */
public class A033261 extends InverseSequence {

  /** Construct the sequence. */
  public A033261() {
    super(1, 1, new A033260());
  }
}
