package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A014579 Inverse of 570th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A014579 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014579() {
    super(Cyclotomic.inverse(570));
  }
}
