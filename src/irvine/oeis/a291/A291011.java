package irvine.oeis.a291;

import irvine.oeis.LinearRecurrence;

/**
 * A291011 p-INVERT of <code>(1,1,1,1,1,...),</code> where p(S) <code>= (1 -</code> S)^2 <code>(1 - 2</code> S).
 * @author Sean A. Irvine
 */
public class A291011 extends LinearRecurrence {

  /** Construct the sequence. */
  public A291011() {
    super(new long[] {12, -16, 7}, new long[] {4, 15, 52});
  }
}
