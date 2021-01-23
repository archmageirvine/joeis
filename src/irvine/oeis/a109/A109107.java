package irvine.oeis.a109;

import irvine.oeis.LinearRecurrence;

/**
 * A109107 a(n) = (1/sqrt(26))((5+sqrt(26))^(n+1)-(5-sqrt(26))^(n+1)).
 * @author Sean A. Irvine
 */
public class A109107 extends LinearRecurrence {

  /** Construct the sequence. */
  public A109107() {
    super(new long[] {1, 10}, new long[] {2, 20});
  }
}
