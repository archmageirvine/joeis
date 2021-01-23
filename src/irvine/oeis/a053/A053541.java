package irvine.oeis.a053;

import irvine.oeis.LinearRecurrence;

/**
 * A053541 a(n) = n*10^(n-1).
 * @author Sean A. Irvine
 */
public class A053541 extends LinearRecurrence {

  /** Construct the sequence. */
  public A053541() {
    super(new long[] {-100, 20}, new long[] {1, 20});
  }
}
