package irvine.oeis.a123;

import irvine.oeis.LinearRecurrence;

/**
 * A123684 Alternate <code>A016777(n)</code> with <code>A000027(n)</code>.
 * @author Sean A. Irvine
 */
public class A123684 extends LinearRecurrence {

  /** Construct the sequence. */
  public A123684() {
    super(new long[] {-1, 0, 2, 0}, new long[] {1, 1, 4, 2});
  }
}
