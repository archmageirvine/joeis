package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A014490 Inverse of 481st cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A014490 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014490() {
    super(Cyclotomic.inverse(481));
  }
}
