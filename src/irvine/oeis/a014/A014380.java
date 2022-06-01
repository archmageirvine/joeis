package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A014380 Inverse of 371st cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A014380 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014380() {
    super(Cyclotomic.inverse(371));
  }
}
