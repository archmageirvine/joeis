package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A015149 Inverse of 1140th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015149 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015149() {
    super(Cyclotomic.inverse(1140));
  }
}
