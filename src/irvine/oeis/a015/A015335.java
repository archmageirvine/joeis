package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015335 Inverse of 1326th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015335 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015335() {
    super(Cyclotomic.inverse(1326));
  }
}
