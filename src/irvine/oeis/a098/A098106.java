package irvine.oeis.a098;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A098106 Hankel transform of sequence (b(n)) where b(n) = Sum_{i=0..n} binomial(2*i,i).
 * @author Georg Fischer
 */
public class A098106 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A098106() {
    // (2*n-3)^2*a(n)+(-8*(n-2)^2-16*n+18)*a(n-1)+4*(-1+2*n)^2*a(n-2) = 0
    super(0, "[[0],[-4, 16,-16],[14,-16, 8],[-9, 12,-4]]", "1, 3", 0);
  }
}
