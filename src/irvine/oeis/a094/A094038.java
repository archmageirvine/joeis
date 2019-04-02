package irvine.oeis.a094;

import irvine.oeis.LinearRecurrence;

/**
 * A094038 Binomial transform of (Pell(-n)+Pell(n))/2.
 * @author Sean A. Irvine
 */
public class A094038 extends LinearRecurrence {

  /** Construct the sequence. */
  public A094038() {
    super(new long[] {4, -8, 0, 4}, new long[] {0, 1, 2, 8});
  }
}
