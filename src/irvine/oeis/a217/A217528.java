package irvine.oeis.a217;

import irvine.oeis.LinearRecurrence;

/**
 * A217528 <code>a(n) = (n-2)*(n-3)*2^(n-2)+2^n-2</code>.
 * @author Sean A. Irvine
 */
public class A217528 extends LinearRecurrence {

  /** Construct the sequence. */
  public A217528() {
    super(new long[] {-8, 20, -18, 7}, new long[] {1, 2, 6, 22});
  }
}
