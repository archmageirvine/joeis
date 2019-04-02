package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017632 (12n+9)^4.
 * @author Sean A. Irvine
 */
public class A017632 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017632() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {6561, 194481, 1185921, 4100625, 10556001});
  }
}
