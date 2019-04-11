package irvine.oeis.a062;

import irvine.oeis.LinearRecurrence;

/**
 * A062966 <code>a(n) =</code> C(3+n, <code>n) +</code> C(4+n, <code>n) +</code> C(5+n, <code>n) +</code> C(6+n, <code>n)</code>.
 * @author Sean A. Irvine
 */
public class A062966 extends LinearRecurrence {

  /** Construct the sequence. */
  public A062966() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {4, 22, 74, 195, 441, 896, 1680});
  }
}
