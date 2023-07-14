package irvine.oeis.a331;
// manually deris/recordval at 2022-10-26 11:22

import irvine.oeis.RecordSequence;
import irvine.oeis.a058.A058249;

/**
 * A331620 Records of A058249: (Smallest prime &gt;= 2^n) - (largest prime &lt;= 2^n).
 * @author Georg Fischer
 */
public class A331620 extends RecordSequence {

  /** Construct the sequence. */
  public A331620() {
    super(new A058249().skip(1), false);
  }
}
