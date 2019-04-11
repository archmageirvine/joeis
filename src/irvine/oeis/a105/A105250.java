package irvine.oeis.a105;

import irvine.oeis.LinearRecurrence;

/**
 * A105250 <code>a(n) =</code> binomial(n+3,n)*binomial(n+7,n).
 * @author Sean A. Irvine
 */
public class A105250 extends LinearRecurrence {

  /** Construct the sequence. */
  public A105250() {
    super(new long[] {1, -11, 55, -165, 330, -462, 462, -330, 165, -55, 11}, new long[] {1, 32, 360, 2400, 11550, 44352, 144144, 411840, 1061775, 2516800, 5562128});
  }
}
