package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A015307 Inverse of 1298th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015307 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015307() {
    super(Cyclotomic.inverse(1298));
  }
}
