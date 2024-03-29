package irvine.oeis.a133;
// Generated by ./gen_seq4.pl /partsum at 2022-06-25 09:09

import irvine.oeis.PartialSumSequence;
import irvine.oeis.a061.A061285;

/**
 * A133155 Numbers formed by setting bits representing odd primes, where bit_no = (prime - 1)/2. Setting bit number b is the same as OR-ing with 2^b (i.e., bit numbers start at zero).
 * @author Sean A. Irvine
 */
public class A133155 extends PartialSumSequence {

  /** Construct the sequence. */
  public A133155() {
    super(1, new A061285());
  }
}
