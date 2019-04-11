package irvine.oeis.a104;

import irvine.oeis.LinearRecurrence;

/**
 * A104474 <code>a(n) =</code> binomial(n+3,3)*binomial(n+7,3).
 * @author Sean A. Irvine
 */
public class A104474 extends LinearRecurrence {

  /** Construct the sequence. */
  public A104474() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {35, 224, 840, 2400, 5775, 12320, 24024});
  }
}
