package irvine.oeis.a053;

import irvine.oeis.LinearRecurrence;

/**
 * A053879 a(n) = n^2 mod 7.
 * @author Sean A. Irvine
 */
public class A053879 extends LinearRecurrence {

  /** Construct the sequence. */
  public A053879() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0}, new long[] {0, 1, 4, 2, 2, 4, 1});
  }
}
