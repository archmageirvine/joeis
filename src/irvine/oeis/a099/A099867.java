package irvine.oeis.a099;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A099867 a(n) = 5*a(n-1) - a(n-2) for n&gt;1, a(0)=1, a(1)=9.
 * @author Sean A. Irvine
 */
public class A099867 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099867() {
    super(new long[] {-1, 5}, new long[] {1, 9});
  }
}
