package irvine.oeis.a065;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A065694 Braided power sequence: A065692 is b(n+1) = 3*b(n) + 2*d(n) - c(n), A065693 is c(n+1) = 3*c(n) + 2*b(n) - d(n) and this is d(n+1) = 3*d(n) + 2*c(n) - b(n), starting with b(0) = 0, c(0) = 1 and d(0) = 2.
 * @author Georg Fischer
 */
public class A065694 extends GeneratingFunctionSequence implements Conjectural {


  /** Construct the sequence. */
  public A065694() {
    super(0, new long[] {2, -10, 17},
      new long[] {1, -9, 33, -52});
  }
}
