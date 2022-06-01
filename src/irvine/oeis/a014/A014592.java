package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A014592 Inverse of 583rd cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A014592 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014592() {
    super(Cyclotomic.inverse(583));
  }
}
