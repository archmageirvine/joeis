package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A015899 Inverse of 1890th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015899 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015899() {
    super(Cyclotomic.inverse(1890));
  }
}
