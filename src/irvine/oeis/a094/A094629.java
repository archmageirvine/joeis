package irvine.oeis.a094;

import irvine.oeis.LinearRecurrence;

/**
 * A094629 Numbers n with sum of digits(n) = 2.
 * @author Sean A. Irvine
 */
public class A094629 extends LinearRecurrence {

  /** Construct the sequence. */
  public A094629() {
    super(new long[] {10, 0}, new long[] {2, 11});
  }
}
