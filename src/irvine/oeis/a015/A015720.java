package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A015720 Inverse of 1711th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015720 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015720() {
    super(Cyclotomic.inverse(1711));
  }
}
