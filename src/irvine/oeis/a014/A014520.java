package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A014520 Inverse of <code>511th</code> cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A014520 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014520() {
    super(Cyclotomic.inverse(511));
  }
}
