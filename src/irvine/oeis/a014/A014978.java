package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A014978 Inverse of 969th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A014978 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014978() {
    super(Cyclotomic.inverse(969));
  }
}
