package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A015046 Inverse of 1037th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015046 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015046() {
    super(Cyclotomic.inverse(1037));
  }
}
