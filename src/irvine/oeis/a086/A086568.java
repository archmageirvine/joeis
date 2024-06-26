package irvine.oeis.a086;
// Generated by gen_seq4.pl 2024-07-01/lambdan at 2024-07-01 18:26

import irvine.math.function.Functions;
import irvine.oeis.LambdaSequence;

/**
 * A086568 Smallest number having as many distinct prime factors as n has prime factors, when counted with multiplicity.
 * @author Georg Fischer
 */
public class A086568 extends LambdaSequence {

  /** Construct the sequence. */
  public A086568() {
    super(1, n -> Functions.PRIMORIAL_COUNT.z(Functions.BIG_OMEGA.z(n)));
  }
}
