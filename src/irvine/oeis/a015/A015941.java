package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015941 Inverse of 1932nd cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015941 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015941() {
    super(Cyclotomic.inverse(1932));
  }
}
