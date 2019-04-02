package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015560 Inverse of 1551st cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015560 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015560() {
    super(Cyclotomic.inverse(1551));
  }
}
