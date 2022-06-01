package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A014446 Inverse of 437th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A014446 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014446() {
    super(Cyclotomic.inverse(437));
  }
}
