package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A014579 Inverse of <code>570th</code> cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A014579 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014579() {
    super(Cyclotomic.inverse(570));
  }
}
