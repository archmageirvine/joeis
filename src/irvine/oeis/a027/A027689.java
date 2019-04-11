package irvine.oeis.a027;

import irvine.oeis.LinearRecurrence;

/**
 * A027689 <code>a(n) = n^2 + n + 4</code>.
 * @author Sean A. Irvine
 */
public class A027689 extends LinearRecurrence {

  /** Construct the sequence. */
  public A027689() {
    super(new long[] {1, -3, 3}, new long[] {4, 6, 10});
  }
}
