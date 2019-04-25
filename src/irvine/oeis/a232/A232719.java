package irvine.oeis.a232;

import irvine.oeis.LinearRecurrence;

/**
 * A232719 <code>Sum_{k=1,...,2n} (-1)^k binomial(8*n,4*k)</code>.
 * @author Sean A. Irvine
 */
public class A232719 extends LinearRecurrence {

  /** Construct the sequence. */
  public A232719() {
    super(new long[] {16, 120, -135}, new long[] {-69, 9231, -1254465});
  }
}
