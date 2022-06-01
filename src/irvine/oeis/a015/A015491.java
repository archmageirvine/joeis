package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A015491 Inverse of 1482nd cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015491 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015491() {
    super(Cyclotomic.inverse(1482));
  }
}
