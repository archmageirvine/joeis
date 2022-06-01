package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A015205 Inverse of 1196th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015205 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015205() {
    super(Cyclotomic.inverse(1196));
  }
}
