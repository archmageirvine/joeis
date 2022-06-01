package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A015654 Inverse of 1645th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015654 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015654() {
    super(Cyclotomic.inverse(1645));
  }
}
