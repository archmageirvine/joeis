package irvine.oeis.a078;

import irvine.oeis.LinearRecurrence;

/**
 * A078787 <code>a(n) = 101*n + 1</code>.
 * @author Sean A. Irvine
 */
public class A078787 extends LinearRecurrence {

  /** Construct the sequence. */
  public A078787() {
    super(new long[] {-1, 2}, new long[] {1, 102});
  }
}
