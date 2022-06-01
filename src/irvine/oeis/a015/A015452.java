package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A015452 Inverse of 1443rd cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015452 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015452() {
    super(Cyclotomic.inverse(1443));
  }
}
