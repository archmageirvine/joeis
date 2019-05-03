package irvine.oeis.a027;

import irvine.oeis.LinearRecurrence;

/**
 * A027651 Poly-Bernoulli numbers <code>B_n^(k)</code> with <code>k=-4</code>.
 * @author Sean A. Irvine
 */
public class A027651 extends LinearRecurrence {

  /** Construct the sequence. */
  public A027651() {
    super(new long[] {-120, 154, -71, 14}, new long[] {1, 16, 146, 1066});
  }
}
