package irvine.oeis.a098;

import irvine.oeis.LinearRecurrence;

/**
 * A098077 <code>a(n) = n^2*(n+1)*(2*n+1)/3</code>.
 * @author Sean A. Irvine
 */
public class A098077 extends LinearRecurrence {

  /** Construct the sequence. */
  public A098077() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {2, 20, 84, 240, 550});
  }
}
