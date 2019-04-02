package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015582 Inverse of 1573rd cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015582 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015582() {
    super(Cyclotomic.inverse(1573));
  }
}
