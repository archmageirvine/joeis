package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A015998 Inverse of 1989th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015998 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015998() {
    super(Cyclotomic.inverse(1989));
  }
}
