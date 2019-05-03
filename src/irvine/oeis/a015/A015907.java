package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015907 Inverse of <code>1898th</code> cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015907 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015907() {
    super(Cyclotomic.inverse(1898));
  }
}
