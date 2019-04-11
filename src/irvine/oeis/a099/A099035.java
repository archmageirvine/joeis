package irvine.oeis.a099;

import irvine.oeis.LinearRecurrence;

/**
 * A099035 <code>a(n) = (n+1)*2^(n-1) - 1</code>.
 * @author Sean A. Irvine
 */
public class A099035 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099035() {
    super(new long[] {4, -8, 5}, new long[] {1, 5, 15});
  }
}
