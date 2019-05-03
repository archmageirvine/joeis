package irvine.oeis.a016;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A016154 Inverse of <code>2145th</code> cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A016154 extends PeriodicSequence {

  /** Construct the sequence. */
  public A016154() {
    super(Cyclotomic.inverse(2145));
  }
}
