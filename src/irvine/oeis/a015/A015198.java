package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015198 Inverse of 1189th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015198 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015198() {
    super(Cyclotomic.inverse(1189));
  }
}
