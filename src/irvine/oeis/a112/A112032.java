package irvine.oeis.a112;

import irvine.oeis.LinearRecurrence;

/**
 * A112032 Denominator of <code>3/4 + 1/4 - 3/8 - 1/8 + 3/16 + 1/16 - 3/32 - 1/32 + 3/64 ..</code>.
 * @author Sean A. Irvine
 */
public class A112032 extends LinearRecurrence {

  /** Construct the sequence. */
  public A112032() {
    super(new long[] {2, 0}, new long[] {4, 1});
  }
}
