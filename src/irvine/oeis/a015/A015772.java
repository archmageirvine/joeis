package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015772 Inverse of 1763rd cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015772 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015772() {
    super(Cyclotomic.inverse(1763));
  }
}
