package irvine.oeis.a072;

import irvine.oeis.FilterSequence;
import irvine.oeis.a029.A029455;

/**
 * A072712 Primes p such that p divides the (right) concatenation of all numbers from 1 to p written in base 10 (most significant digit on left).
 * @author Sean A. Irvine
 */
public class A072712 extends FilterSequence {

  /** Construct the sequence. */
  public A072712() {
    super(1, new A029455(), PRIME);
  }
}
