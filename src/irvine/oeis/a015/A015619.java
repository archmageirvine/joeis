package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A015619 Inverse of 1610th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015619 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015619() {
    super(Cyclotomic.inverse(1610));
  }
}
