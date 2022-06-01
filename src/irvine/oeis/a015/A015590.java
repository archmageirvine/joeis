package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A015590 Inverse of 1581st cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015590 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015590() {
    super(Cyclotomic.inverse(1581));
  }
}
