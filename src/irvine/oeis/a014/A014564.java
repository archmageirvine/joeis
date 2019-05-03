package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A014564 Inverse of <code>555th</code> cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A014564 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014564() {
    super(Cyclotomic.inverse(555));
  }
}
