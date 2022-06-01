package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A015186 Inverse of 1177th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015186 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015186() {
    super(Cyclotomic.inverse(1177));
  }
}
