package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015267 Inverse of 1258th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015267 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015267() {
    super(Cyclotomic.inverse(1258));
  }
}
