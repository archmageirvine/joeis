package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A015073 Inverse of 1064th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015073 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015073() {
    super(Cyclotomic.inverse(1064));
  }
}
