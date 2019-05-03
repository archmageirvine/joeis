package irvine.oeis.a291;

import irvine.oeis.LinearRecurrence;

/**
 * A291265 <code>a(n) = (1/3)*A291232(n)</code>.
 * @author Sean A. Irvine
 */
public class A291265 extends LinearRecurrence {

  /** Construct the sequence. */
  public A291265() {
    super(new long[] {-1, -6, -7, 6}, new long[] {2, 9, 38, 153});
  }
}
