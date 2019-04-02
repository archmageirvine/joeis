package irvine.oeis.a291;

import irvine.oeis.LinearRecurrence;

/**
 * A291004 p-INVERT of (1,1,1,1,1,...), where p(S) = (1 - 3*S)^2.
 * @author Sean A. Irvine
 */
public class A291004 extends LinearRecurrence {

  /** Construct the sequence. */
  public A291004() {
    super(new long[] {-16, 8}, new long[] {6, 33});
  }
}
