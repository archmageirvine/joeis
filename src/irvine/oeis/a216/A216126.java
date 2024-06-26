package irvine.oeis.a216;

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A216126 a(n) = 5^n mod 10000.
 * @author Georg Fischer
 */
public class A216126 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A216126() {
    super(0, new long[] {1, 5, 25, 125, 624, 3120, 5600, 8000}, new long[] {1, 0, 0, 0, -1});
  }
}
