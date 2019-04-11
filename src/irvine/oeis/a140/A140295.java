package irvine.oeis.a140;

import irvine.oeis.LinearRecurrence;

/**
 * A140295 <code>a(n)=a(n-1)+a(n-2)+2a(n-3)</code>.
 * @author Sean A. Irvine
 */
public class A140295 extends LinearRecurrence {

  /** Construct the sequence. */
  public A140295() {
    super(new long[] {2, 1, 1}, new long[] {1, -2, 4});
  }
}
