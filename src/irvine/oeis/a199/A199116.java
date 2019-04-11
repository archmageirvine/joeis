package irvine.oeis.a199;

import irvine.oeis.LinearRecurrence;

/**
 * A199116 <code>6*4^n+1</code>.
 * @author Sean A. Irvine
 */
public class A199116 extends LinearRecurrence {

  /** Construct the sequence. */
  public A199116() {
    super(new long[] {-4, 5}, new long[] {7, 25});
  }
}
