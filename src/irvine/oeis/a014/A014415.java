package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A014415 Inverse of 406th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A014415 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014415() {
    super(Cyclotomic.inverse(406));
  }
}
