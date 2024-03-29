package irvine.oeis.a183;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A183702 Number of (n+1) X 2 0..3 arrays with every 2 X 2 subblock nonsingular.
 * @author Georg Fischer
 */
public class A183702 extends GeneratingFunctionSequence implements Conjectural {


  /** Construct the sequence. */
  public A183702() {
    super(1, new long[] {0, 192, 360},
      new long[] {1, -11, -24});
  }
}
