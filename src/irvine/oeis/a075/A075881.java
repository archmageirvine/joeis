package irvine.oeis.a075;
// Generated by gen_seq4.pl knowna4/simtraf at 2023-09-26 15:09

import irvine.math.function.Functions;
import irvine.oeis.a007.A007504;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A075881 a(n) = the sum of the prime factors of Sum_{i=1..n} prime(i).
 * @author Georg Fischer
 */
public class A075881 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A075881() {
    super(1, new A007504().skip(), Functions.SOPF::z);
  }
}
