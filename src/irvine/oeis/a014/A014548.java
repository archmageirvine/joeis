package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A014548 Inverse of <code>539th</code> cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A014548 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014548() {
    super(Cyclotomic.inverse(539));
  }
}
