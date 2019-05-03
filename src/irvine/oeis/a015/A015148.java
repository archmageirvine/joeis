package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015148 Inverse of <code>1139th</code> cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015148 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015148() {
    super(Cyclotomic.inverse(1139));
  }
}
