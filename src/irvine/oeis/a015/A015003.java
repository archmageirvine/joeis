package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A015003 Inverse of 994th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015003 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015003() {
    super(Cyclotomic.inverse(994));
  }
}
