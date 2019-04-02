package irvine.oeis.a124;

import irvine.oeis.LinearRecurrence;

/**
 * A124072 First differences of A129819.
 * @author Sean A. Irvine
 */
public class A124072 extends LinearRecurrence {

  /** Construct the sequence. */
  public A124072() {
    super(new long[] {-1, 0, 1, 0, 1, 0}, new long[] {0, 1, 0, 2, 1, 3});
  }
}
