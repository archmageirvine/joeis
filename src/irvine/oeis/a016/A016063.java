package irvine.oeis.a016;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A016063 Inverse of <code>2054th</code> cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A016063 extends PeriodicSequence {

  /** Construct the sequence. */
  public A016063() {
    super(Cyclotomic.inverse(2054));
  }
}
