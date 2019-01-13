package irvine.oeis.a101;

import irvine.oeis.LinearRecurrence;

/**
 * A101214.
 * @author Sean A. Irvine
 */
public class A101214 extends LinearRecurrence {

  /** Construct the sequence. */
  public A101214() {
    super(new long[] {1, -11, 55, -165, 330, -462, 462, -330, 165, -55, 11}, new long[] {0, 27648, 720000, 7776000, 51861600, 252887040, 987614208, 3265920000L, 9487368000L, 24839654400L, 59717623680L});
  }
}
