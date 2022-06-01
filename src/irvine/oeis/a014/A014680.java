package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A014680 Inverse of 671st cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A014680 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014680() {
    super(Cyclotomic.inverse(671));
  }
}
