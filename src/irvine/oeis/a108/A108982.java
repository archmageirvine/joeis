package irvine.oeis.a108;

import irvine.oeis.LinearRecurrence;

/**
 * A108982 Inverse binomial of A003949.
 * @author Sean A. Irvine
 */
public class A108982 extends LinearRecurrence {

  /** Construct the sequence. */
  public A108982() {
    super(new long[] {5, 4}, new long[] {1, 6});
  }
}
