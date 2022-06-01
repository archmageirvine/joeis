package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A015374 Inverse of 1365th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015374 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015374() {
    super(Cyclotomic.inverse(1365));
  }
}
