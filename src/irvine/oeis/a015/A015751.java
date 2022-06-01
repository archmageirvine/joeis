package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A015751 Inverse of 1742nd cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015751 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015751() {
    super(Cyclotomic.inverse(1742));
  }
}
