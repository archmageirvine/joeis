package irvine.oeis.a277;

import irvine.oeis.LinearRecurrence;

/**
 * A277789 <code>a(n) =</code> Sum_{k=0..n} <code>(-1)^k*floor((1 + sqrt(2))^k)</code>.
 * @author Sean A. Irvine
 */
public class A277789 extends LinearRecurrence {

  /** Construct the sequence. */
  public A277789() {
    super(new long[] {1, -3, 0, 4, -1}, new long[] {1, -1, 4, -10, 23});
  }
}
