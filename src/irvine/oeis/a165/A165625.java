package irvine.oeis.a165;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A165625 a(n)=(5/3)*(1+2*(-5)^(n-1)).
 * @author Sean A. Irvine
 */
public class A165625 extends LinearRecurrence {

  /** Construct the sequence. */
  public A165625() {
    super(new long[] {5, -4}, new long[] {1, 5});
  }
}
