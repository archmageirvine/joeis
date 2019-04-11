package irvine.oeis.a167;

import irvine.oeis.LinearRecurrence;

/**
 * A167778 Subsequence of A167708 whose indices are <code>2 mod 5</code>.
 * @author Sean A. Irvine
 */
public class A167778 extends LinearRecurrence {

  /** Construct the sequence. */
  public A167778() {
    super(new long[] {-1, 340}, new long[] {66, 22335});
  }
}
