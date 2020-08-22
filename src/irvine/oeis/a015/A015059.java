package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015059 Inverse of 1050th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015059 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015059() {
    super(Cyclotomic.inverse(1050));
  }
}
