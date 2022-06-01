package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A015342 Inverse of 1333rd cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015342 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015342() {
    super(Cyclotomic.inverse(1333));
  }
}
