package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015900 Inverse of 1891st cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015900 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015900() {
    super(Cyclotomic.inverse(1891));
  }
}
