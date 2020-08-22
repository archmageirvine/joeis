package irvine.oeis.a087;

import irvine.oeis.LinearRecurrence;

/**
 * A087448 3^(n-1)(n+3)/2-(n-1)/2.
 * @author Sean A. Irvine
 */
public class A087448 extends LinearRecurrence {

  /** Construct the sequence. */
  public A087448() {
    super(new long[] {-9, 24, -22, 8}, new long[] {1, 2, 7, 26});
  }
}
