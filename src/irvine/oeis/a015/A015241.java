package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A015241 Inverse of 1232nd cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015241 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015241() {
    super(Cyclotomic.inverse(1232));
  }
}
