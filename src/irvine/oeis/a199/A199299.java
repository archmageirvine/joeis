package irvine.oeis.a199;

import irvine.oeis.LinearRecurrence;

/**
 * A199299 a(n) = (2*n + 1)*6^n.
 * @author Sean A. Irvine
 */
public class A199299 extends LinearRecurrence {

  /** Construct the sequence. */
  public A199299() {
    super(new long[] {-36, 12}, new long[] {1, 18});
  }
}
