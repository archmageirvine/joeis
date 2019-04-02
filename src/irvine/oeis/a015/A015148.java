package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015148 Inverse of 1139th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015148 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015148() {
    super(Cyclotomic.inverse(1139));
  }
}
