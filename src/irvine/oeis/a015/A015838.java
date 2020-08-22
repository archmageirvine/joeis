package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015838 Inverse of 1829th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015838 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015838() {
    super(Cyclotomic.inverse(1829));
  }
}
