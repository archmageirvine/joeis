package irvine.oeis.a091;

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A091337 a(n) = (2/n), where (k/n) is the Kronecker symbol.
 * @author Georg Fischer
 */
public class A091337 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A091337() {
    super(0, new long[] {0, 1, 0, -1}, new long[] {1, 0, 0, 0, 1});
  }
}
