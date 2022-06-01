package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A014947 Inverse of 938th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A014947 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014947() {
    super(Cyclotomic.inverse(938));
  }
}
