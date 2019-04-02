package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015352 Inverse of 1343rd cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015352 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015352() {
    super(Cyclotomic.inverse(1343));
  }
}
