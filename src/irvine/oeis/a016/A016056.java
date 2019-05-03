package irvine.oeis.a016;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A016056 Inverse of <code>2047th</code> cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A016056 extends PeriodicSequence {

  /** Construct the sequence. */
  public A016056() {
    super(Cyclotomic.inverse(2047));
  }
}
