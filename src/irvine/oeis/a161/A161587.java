package irvine.oeis.a161;

import irvine.oeis.LinearRecurrence;

/**
 * A161587 <code>a(n) = 13n^2 + 10n + 1</code>.
 * @author Sean A. Irvine
 */
public class A161587 extends LinearRecurrence {

  /** Construct the sequence. */
  public A161587() {
    super(new long[] {1, -3, 3}, new long[] {1, 24, 73});
  }
}
