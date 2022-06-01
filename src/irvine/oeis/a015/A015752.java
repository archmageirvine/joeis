package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A015752 Inverse of 1743rd cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015752 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015752() {
    super(Cyclotomic.inverse(1743));
  }
}
