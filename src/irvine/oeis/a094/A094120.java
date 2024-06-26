package irvine.oeis.a094;
// Generated by gen_seq4.pl 2024-04-24/lambdan at 2024-04-24 18:19

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A094120 a(n) = Sum_{k=1..n} Sum_{i=1..k} (-2)^valuation(i,2).
 * @author Georg Fischer
 */
public class A094120 extends LambdaSequence {

  /** Construct the sequence. */
  public A094120() {
    super(0, n -> Integers.SINGLETON.sum(1, n, k -> Integers.SINGLETON.sum(1, k, i -> Z.valueOf(-2).pow(Functions.VALUATION.i(i, Z.TWO)))));
  }
}
