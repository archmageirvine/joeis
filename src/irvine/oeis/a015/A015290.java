package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A015290 Inverse of 1281st cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015290 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015290() {
    super(Cyclotomic.inverse(1281));
  }
}
