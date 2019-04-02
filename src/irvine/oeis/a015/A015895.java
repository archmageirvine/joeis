package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015895 Inverse of 1886th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015895 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015895() {
    super(Cyclotomic.inverse(1886));
  }
}
