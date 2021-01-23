package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015016 Inverse of 1007th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015016 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015016() {
    super(Cyclotomic.inverse(1007));
  }
}
