package irvine.oeis.a103;
// Generated by gen_seq4.pl robots/lingf at 2023-09-09 10:06

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A103610 4 X infinity array read by rows: let M = {{0, 1, 0, 0}, {0, 0, 1, 0}, {0, 0, 0, 1}, {1, 0, 1, 0}}, w[0] = {0, 0, 1, 1}', w[n]' = M*w[n -1]'; the n-th row of the array is w[n]' (the prime denotes transpose).
 * @author Georg Fischer
 */
public class A103610 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A103610() {
    super(0, "[0, 0, 1, 1, 0, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 1]", "[1, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, -1]");
  }
}
