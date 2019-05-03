package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015946 Inverse of <code>1937th</code> cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015946 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015946() {
    super(Cyclotomic.inverse(1937));
  }
}
