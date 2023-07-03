package irvine.oeis.a048;

import irvine.oeis.InverseSequence;

/**
 * A048183 Least inverse of A048182.
 * @author Sean A. Irvine
 */
public class A048183 extends InverseSequence {

  /** Construct the sequence. */
  public A048183() {
    super(0, new A048182(), 0, 2);
  }
}
