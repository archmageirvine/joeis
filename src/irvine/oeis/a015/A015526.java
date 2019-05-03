package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015526 Inverse of <code>1517th</code> cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015526 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015526() {
    super(Cyclotomic.inverse(1517));
  }
}
