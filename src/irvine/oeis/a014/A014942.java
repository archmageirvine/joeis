package irvine.oeis.a014;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A014942 ( 1+24^n*(23*n-1) ) / 529.
 * @author Sean A. Irvine
 */
public class A014942 extends LinearRecurrence {

  /** Construct the sequence. */
  public A014942() {
    super(new long[] {576, -624, 49}, new long[] {1, 49, 1777});
  }
}
