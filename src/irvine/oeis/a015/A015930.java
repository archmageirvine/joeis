package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015930 Inverse of 1921st cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015930 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015930() {
    super(Cyclotomic.inverse(1921));
  }
}
