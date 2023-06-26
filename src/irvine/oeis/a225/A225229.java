package irvine.oeis.a225;

import irvine.oeis.FiniteSequence;

/**
 * A225229 Numbers n such that if some integer N can be written in the form (a/2)^2+n*(b/2)^2 for integers a and b, then every prime factor P of N which occurs to an odd power can also be written in the form (c/2)^2+n*(d/2)^2 for integers c and d.
 * @author Georg Fischer
 */
public class A225229 extends FiniteSequence {

  /** Construct the sequence. */
  public A225229() {
    super(1, FINITE, 1, 2, 3, 4, 7, 8, 11, 12, 19, 43, 67, 163);
  }
}
