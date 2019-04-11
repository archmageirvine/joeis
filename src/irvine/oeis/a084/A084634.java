package irvine.oeis.a084;

import irvine.oeis.LinearRecurrence;

/**
 * A084634 Binomial transform of <code>1,1,1,2,2,2,2,..</code>.
 * @author Sean A. Irvine
 */
public class A084634 extends LinearRecurrence {

  /** Construct the sequence. */
  public A084634() {
    super(new long[] {-2, 7, -9, 5}, new long[] {1, 2, 4, 9});
  }
}
