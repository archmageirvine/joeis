package irvine.oeis.a291;

import irvine.oeis.LinearRecurrence;

/**
 * A291397 p-INVERT of <code>(1,1,0,0,0,0,</code>...), where p(S) <code>= 1 -</code> S - S^3.
 * @author Sean A. Irvine
 */
public class A291397 extends LinearRecurrence {

  /** Construct the sequence. */
  public A291397() {
    super(new long[] {1, 3, 3, 1, 1, 1}, new long[] {1, 2, 4, 10, 22, 46});
  }
}
