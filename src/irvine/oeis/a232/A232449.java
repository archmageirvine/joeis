package irvine.oeis.a232;

import irvine.oeis.LinearRecurrence;

/**
 * A232449 The palindromic Belphegor numbers: (10^(n+3)+666)*10^(n+1)+1.
 * @author Sean A. Irvine
 */
public class A232449 extends LinearRecurrence {

  /** Construct the sequence. */
  public A232449() {
    super(new long[] {1000, -1110, 111}, new long[] {16661, 1066601, 100666001});
  }
}
