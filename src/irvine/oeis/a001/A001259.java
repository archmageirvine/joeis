package irvine.oeis.a001;

import irvine.oeis.FiniteSequence;

/**
 * A001259 A sequence of sorted odd primes 3 = p_1 &lt; p_2 &lt; ... &lt; p_m such that p_i-2 divides the product p_1*p_2*...*p_(i-1) of the earlier primes and each prime factor of p_i-1 is a prime factor of twice the product.
 * @author Sean A. Irvine
 */
public class A001259 extends FiniteSequence {

  /** Construct the sequence. */
  public A001259() {
    super(1, FINITE, 3, 5, 7, 17, 19, 37, 97, 113, 257, 401, 487, 631, 971, 1297, 1801, 19457, 22051, 28817, 65537, 157303, 160001);
  }
}

