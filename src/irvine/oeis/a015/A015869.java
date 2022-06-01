package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A015869 Inverse of 1860th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015869 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015869() {
    super(Cyclotomic.inverse(1860));
  }
}
