package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015538 Inverse of 1529th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015538 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015538() {
    super(Cyclotomic.inverse(1529));
  }
}
