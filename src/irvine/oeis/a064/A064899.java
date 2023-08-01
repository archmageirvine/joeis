package irvine.oeis.a064;

import irvine.oeis.IntersectionSequence;
import irvine.oeis.a006.A006881;
import irvine.oeis.a060.A060652;

/**
 * A064899 Numbers that are of the form pq where p and q are distinct primes that are the orders of non-Abelian groups.
 * @author Sean A. Irvine
 */
public class A064899 extends IntersectionSequence {

  /** Construct the sequence. */
  public A064899() {
    super(new A060652(), new A006881());
  }
}

