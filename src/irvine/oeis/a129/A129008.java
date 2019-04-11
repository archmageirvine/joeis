package irvine.oeis.a129;

import irvine.oeis.LinearRecurrence;

/**
 * A129008 <code>(n^3+n^2)*8^n</code>.
 * @author Sean A. Irvine
 */
public class A129008 extends LinearRecurrence {

  /** Construct the sequence. */
  public A129008() {
    super(new long[] {-4096, 2048, -384, 32}, new long[] {16, 768, 18432, 327680});
  }
}
