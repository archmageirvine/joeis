package irvine.oeis.a106;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A106570 a(n) = 4*a(n-1) + 3*a(n-2), with a(0)=0, a(1)=3.
 * @author Sean A. Irvine
 */
public class A106570 extends LinearRecurrence {

  /** Construct the sequence. */
  public A106570() {
    super(new long[] {3, 4}, new long[] {0, 3});
  }
}
