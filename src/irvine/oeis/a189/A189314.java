package irvine.oeis.a189;
// Generated by gen_seq4.pl 2024-01-25/filter at 2024-01-26 22:29

import irvine.math.function.Functions;
import irvine.oeis.FilterSequence;
import irvine.oeis.a018.A018252;

/**
 * A189314 Nonprimes k such that 2*omega(4k) = omega(4k+2), where omega(j) is the number of distinct primes dividing j, A001221.
 * @author Georg Fischer
 */
public class A189314 extends FilterSequence {

  /** Construct the sequence. */
  public A189314() {
    super(1, new A018252(), p -> 2 * Functions.OMEGA.i(p.multiply(4)) == Functions.OMEGA.i(p.multiply(4).add(2)));
  }
}
