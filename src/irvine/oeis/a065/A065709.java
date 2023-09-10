package irvine.oeis.a065;

import irvine.oeis.FilterSequence;

/**
 * A065709 Reduced sequence related to reciprocal Pythagorean triples: 1/a(n)^2 + 1/k^2 = 1/j^2 has an integer solution (k,j) with k&lt;a(n) and a(n) not a multiple of 20.
 * @author Sean A. Irvine
 */
public class A065709 extends FilterSequence {

  /** Construct the sequence. */
  public A065709() {
    super(new A065607(), k -> k.mod(20) != 0);
  }
}
