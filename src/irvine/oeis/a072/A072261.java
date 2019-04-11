package irvine.oeis.a072;

import irvine.oeis.LinearRecurrence;

/**
 * A072261 <code>a(n) = 4*a(n-1)+1, a(1)=7</code>.
 * @author Sean A. Irvine
 */
public class A072261 extends LinearRecurrence {

  /** Construct the sequence. */
  public A072261() {
    super(new long[] {-4, 5}, new long[] {7, 29});
  }
}
