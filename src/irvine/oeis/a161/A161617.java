package irvine.oeis.a161;

import irvine.oeis.LinearRecurrence;

/**
 * A161617 <code>8*n^2+20*n+1</code>.
 * @author Sean A. Irvine
 */
public class A161617 extends LinearRecurrence {

  /** Construct the sequence. */
  public A161617() {
    super(new long[] {1, -3, 3}, new long[] {1, 29, 73});
  }
}
