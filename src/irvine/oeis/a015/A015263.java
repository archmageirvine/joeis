package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015263 Inverse of 1254th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015263 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015263() {
    super(Cyclotomic.inverse(1254));
  }
}
