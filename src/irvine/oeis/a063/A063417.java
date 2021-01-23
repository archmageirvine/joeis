package irvine.oeis.a063;

import irvine.oeis.LinearRecurrence;

/**
 * A063417 Ninth column (k=8) of septinomial array A063265.
 * @author Sean A. Irvine
 */
public class A063417 extends LinearRecurrence {

  /** Construct the sequence. */
  public A063417() {
    super(new long[] {1, -9, 36, -84, 126, -126, 84, -36, 9}, new long[] {5, 36, 149, 470, 1251, 2954, 6371, 12789, 24210});
  }
}
