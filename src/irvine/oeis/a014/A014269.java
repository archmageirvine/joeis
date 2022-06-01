package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A014269 Inverse of 260th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A014269 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014269() {
    super(Cyclotomic.inverse(260));
  }
}
