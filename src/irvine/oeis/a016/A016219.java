package irvine.oeis.a016;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A016219 Inverse of <code>2210th</code> cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A016219 extends PeriodicSequence {

  /** Construct the sequence. */
  public A016219() {
    super(Cyclotomic.inverse(2210));
  }
}
