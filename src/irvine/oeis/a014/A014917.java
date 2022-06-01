package irvine.oeis.a014;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A014917 a(1)=1, a(n) = n*5^(n-1) + a(n-1).
 * @author Sean A. Irvine
 */
public class A014917 extends LinearRecurrence {

  /** Construct the sequence. */
  public A014917() {
    super(new long[] {25, -35, 11}, new long[] {1, 11, 86});
  }
}
