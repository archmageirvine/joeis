package irvine.oeis.a016;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A016004 Inverse of <code>1995th</code> cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A016004 extends PeriodicSequence {

  /** Construct the sequence. */
  public A016004() {
    super(Cyclotomic.inverse(1995));
  }
}
