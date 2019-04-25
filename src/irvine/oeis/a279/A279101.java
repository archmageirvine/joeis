package irvine.oeis.a279;

import irvine.oeis.LinearRecurrence;

/**
 * A279101 <code>a(n) = Sum_{k=0..n}</code> ceiling((1 <code>+ sqrt(2))^k)</code>.
 * @author Sean A. Irvine
 */
public class A279101 extends LinearRecurrence {

  /** Construct the sequence. */
  public A279101() {
    super(new long[] {1, 1, -4, 0, 3}, new long[] {1, 4, 10, 25, 59});
  }
}
