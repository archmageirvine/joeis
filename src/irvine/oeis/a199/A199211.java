package irvine.oeis.a199;

import irvine.oeis.LinearRecurrence;

/**
 * A199211 <code>11*4^n+1</code>.
 * @author Sean A. Irvine
 */
public class A199211 extends LinearRecurrence {

  /** Construct the sequence. */
  public A199211() {
    super(new long[] {-4, 5}, new long[] {12, 45});
  }
}
