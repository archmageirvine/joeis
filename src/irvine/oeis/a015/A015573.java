package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A015573 Inverse of 1564th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015573 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015573() {
    super(Cyclotomic.inverse(1564));
  }
}
