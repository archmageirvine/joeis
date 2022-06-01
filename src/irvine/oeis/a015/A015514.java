package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A015514 Inverse of 1505th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015514 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015514() {
    super(Cyclotomic.inverse(1505));
  }
}
