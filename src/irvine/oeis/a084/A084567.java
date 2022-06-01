package irvine.oeis.a084;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A084567 Binomial transform of (1,-1,4,-16,64,-256,1024,....)=(3*0^n-(-4)^n)/4.
 * @author Sean A. Irvine
 */
public class A084567 extends LinearRecurrence {

  /** Construct the sequence. */
  public A084567() {
    super(new long[] {3, -2}, new long[] {1, 0});
  }
}
