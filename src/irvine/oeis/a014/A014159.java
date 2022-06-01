package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A014159 Inverse of 150th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A014159 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014159() {
    super(Cyclotomic.inverse(150));
  }
}
