package irvine.oeis.a078;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A078836 a(n) = n*2^(n-6).
 * @author Sean A. Irvine
 */
public class A078836 extends LinearRecurrence {

  /** Construct the sequence. */
  public A078836() {
    super(6, new long[] {-4, 4}, new long[] {6, 14});
  }
}
