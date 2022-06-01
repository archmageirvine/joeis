package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A015426 Inverse of 1417th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015426 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015426() {
    super(Cyclotomic.inverse(1417));
  }
}
