package irvine.oeis.a165;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A165638 a(n)=(6/7)*(2+5*(-6)^(n-1)).
 * @author Sean A. Irvine
 */
public class A165638 extends LinearRecurrence {

  /** Construct the sequence. */
  public A165638() {
    super(new long[] {6, -5}, new long[] {1, 6});
  }
}
