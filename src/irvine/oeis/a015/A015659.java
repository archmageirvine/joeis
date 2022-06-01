package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A015659 Inverse of 1650th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015659 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015659() {
    super(Cyclotomic.inverse(1650));
  }
}
