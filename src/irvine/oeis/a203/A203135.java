package irvine.oeis.a203;

import irvine.oeis.LinearRecurrence;

/**
 * A203135 Indices of hexagonal numbers that are also decagonal.
 * @author Sean A. Irvine
 */
public class A203135 extends LinearRecurrence {

  /** Construct the sequence. */
  public A203135() {
    super(new long[] {1, -35, 35}, new long[] {1, 28, 943});
  }
}
