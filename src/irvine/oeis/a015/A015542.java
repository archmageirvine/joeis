package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015542 Inverse of 1533rd cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015542 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015542() {
    super(Cyclotomic.inverse(1533));
  }
}
