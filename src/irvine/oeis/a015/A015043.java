package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015043 Inverse of 1034th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015043 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015043() {
    super(Cyclotomic.inverse(1034));
  }
}
