package irvine.oeis.a336;
// Generated by gen_seq4.pl 2024-01-15/filamb at 2024-01-17 19:19

import irvine.math.function.Functions;
import irvine.oeis.FilterLambdaSequence;

/**
 * A336700 Numbers k such that the odd part of (1+k) divides (1 + odd part of sigma(k)).
 * @author Georg Fischer
 */
public class A336700 extends FilterLambdaSequence {

  /** Construct the sequence. */
  public A336700() {
    super(1, 1, k -> Functions.SIGMA1.z(k).makeOdd().add(1).mod(k.add(1).makeOdd()).isZero());
  }
}
