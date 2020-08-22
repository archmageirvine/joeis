package irvine.oeis.a014;

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A014610 Tetranacci numbers arising in connection with current algebras sp(2)_n.
 * @author Sean A. Irvine
 */
public class A014610 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A014610() {
    super(new long[] {3, 2, 2, 1},
      new long[] {1, -1, -1, -1, -1});
  }
}
