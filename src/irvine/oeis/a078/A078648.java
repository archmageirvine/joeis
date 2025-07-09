package irvine.oeis.a078;

import irvine.oeis.InverseSequence;
import irvine.oeis.a074.A074169;

/**
 * A078648 Smallest integer that can be written in exactly n ways as the sum of two primes that are not congruent modulo 3.
 * @author Sean A. Irvine
 */
public class A078648 extends InverseSequence {

  /** Construct the sequence. */
  public A078648() {
    super(1, new A074169());
  }
}
