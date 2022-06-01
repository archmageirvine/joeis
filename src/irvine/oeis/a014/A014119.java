package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A014119 Inverse of 110th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A014119 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014119() {
    super(Cyclotomic.inverse(110));
  }
}
