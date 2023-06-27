package irvine.oeis.a129;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A129008 (n^3+n^2)*8^n.
 * @author Sean A. Irvine
 */
public class A129008 extends LinearRecurrence {

  /** Construct the sequence. */
  public A129008() {
    super(1, new long[] {-4096, 2048, -384, 32}, new long[] {16, 768, 18432, 327680});
  }
}
