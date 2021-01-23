package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015615 Inverse of 1606th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015615 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015615() {
    super(Cyclotomic.inverse(1606));
  }
}
