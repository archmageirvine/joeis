package irvine.oeis.a014;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A014920 a(1)=1, a(n) = n*7^(n-1) + a(n-1).
 * @author Sean A. Irvine
 */
public class A014920 extends LinearRecurrence {

  /** Construct the sequence. */
  public A014920() {
    super(1, new long[] {49, -63, 15}, new long[] {1, 15, 162});
  }
}
