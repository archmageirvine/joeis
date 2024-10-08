package irvine.oeis.a368;
// Generated by gen_seq4.pl lambdian2/partsun at 2024-09-23 17:41

import irvine.oeis.PartialSumSequence;

/**
 * A368906 a(n) is the number of integers k in the range 0..n such that A342001(A005940(1+k)) is not divisible by p^p for any prime p.
 * @author Georg Fischer
 */
public class A368906 extends PartialSumSequence {

  /** Construct the sequence. */
  public A368906() {
    super(0, new A368905());
  }
}
