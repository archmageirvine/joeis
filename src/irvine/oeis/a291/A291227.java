package irvine.oeis.a291;

import irvine.oeis.LinearRecurrence;

/**
 * A291227 p-INVERT of <code>(0,1,0,1,0,1,...),</code> where p(S) <code>= 1 -</code> S <code>- 2</code> S^2.
 * @author Sean A. Irvine
 */
public class A291227 extends LinearRecurrence {

  /** Construct the sequence. */
  public A291227() {
    super(new long[] {-1, -1, 4, 1}, new long[] {1, 3, 6, 17});
  }
}
