package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A014152 Inverse of 143rd cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A014152 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014152() {
    super(Cyclotomic.inverse(143));
  }
}
