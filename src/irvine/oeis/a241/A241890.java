package irvine.oeis.a241;

import irvine.oeis.LinearRecurrence;

/**
 * A241890 a(n) = n^2 + 24.
 * @author Sean A. Irvine
 */
public class A241890 extends LinearRecurrence {

  /** Construct the sequence. */
  public A241890() {
    super(new long[] {1, -3, 3}, new long[] {24, 25, 28});
  }
}
