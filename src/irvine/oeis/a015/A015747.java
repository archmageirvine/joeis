package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015747 Inverse of 1738th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015747 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015747() {
    super(Cyclotomic.inverse(1738));
  }
}
