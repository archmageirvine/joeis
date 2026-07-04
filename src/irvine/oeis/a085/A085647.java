package irvine.oeis.a085;

import irvine.math.predicate.Predicates;
import irvine.oeis.FilterSequence;
import irvine.oeis.a006.A006881;

/**
 * A085647 Semiprimes whose prime factors p*q have an equal number of decimal digits and p is not equal to q.
 * @author Sean A. Irvine
 */
public class A085647 extends FilterSequence {

  /** Construct the sequence. */
  public A085647() {
    super(new A006881(), Predicates.BRILLIANT::is);
  }
}
