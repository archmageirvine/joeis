package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A014135 Inverse of <code>126th</code> cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A014135 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014135() {
    super(Cyclotomic.inverse(126));
  }
}
