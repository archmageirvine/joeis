package irvine.oeis.a081;
// Generated by gen_seq4.pl 2023-09-18/filtpos at 2023-09-18 10:04

import irvine.math.function.Functions;
import irvine.oeis.FilterPositionSequence;
import irvine.oeis.LambdaSequence;

/**
 * A081711 Numbers k such that k! + k# - 1 is prime, where k# is the primorial function A034386(k).
 * @author Georg Fischer
 */
public class A081711 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A081711() {
    super(1, 1, new LambdaSequence(1, k -> Functions.FACTORIAL.z(k).add(Functions.PRIMORIAL.z(k)).add(-1)), PRIME);
  }
}
