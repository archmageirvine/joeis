package irvine.oeis.a016;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A016068 Inverse of <code>2059th</code> cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A016068 extends PeriodicSequence {

  /** Construct the sequence. */
  public A016068() {
    super(Cyclotomic.inverse(2059));
  }
}
