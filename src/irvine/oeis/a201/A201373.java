package irvine.oeis.a201;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A201373 Number of n X 6 0..1 arrays with rows and columns lexicographically nondecreasing read forwards, and nonincreasing read backwards.
 * @author Georg Fischer
 */
public class A201373 extends GeneratingFunctionSequence implements Conjectural {


  /** Construct the sequence. */
  public A201373() {
    super(1, new long[] {0, 2, -15, 65, -140, 324, -166, 20, -349, 391, -142, 18},
      new long[] {1, -11, 55, -165, 330, -462, 462, -330, 165, -55, 11, -1});
  }
}
