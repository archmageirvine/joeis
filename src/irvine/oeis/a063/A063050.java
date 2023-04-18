package irvine.oeis.a063;

import irvine.oeis.a006.A006960;

/**
 * A063050 a(n) = number of 'Reverse and Add!' operations that have to be applied to the n-th term of A063049 in order to obtain a term in the trajectory of 196.
 * @author Sean A. Irvine
 */
public class A063050 extends A063056 {

  /** Construct the sequence. */
  public A063050() {
    super(new A006960(), 294);
  }
}
