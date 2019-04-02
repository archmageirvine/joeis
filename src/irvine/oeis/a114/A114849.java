package irvine.oeis.a114;

import irvine.oeis.LinearRecurrence;

/**
 * A114849 F(4n+4)/F(4)-F(3n+3)/F(3) where F(n)=A000045(n).
 * @author Sean A. Irvine
 */
public class A114849 extends LinearRecurrence {

  /** Construct the sequence. */
  public A114849() {
    super(new long[] {1, -3, -28, 11}, new long[] {0, 3, 31, 257});
  }
}
