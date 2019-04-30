package irvine.oeis.a121;

import irvine.oeis.LinearRecurrence;

/**
 * A121338 Pentagonal numbers <code>P(k)</code> that are one-third of other pentagonal numbers: <code>P(k)</code> such that 3*P(k)=P(m) for some m&gt;k.
 * @author Sean A. Irvine
 */
public class A121338 extends LinearRecurrence {

  /** Construct the sequence. */
  public A121338() {
    super(new long[] {1, -7300803, 7300803}, new long[] {70, 511258935, 3732600255368600L});
  }
}
