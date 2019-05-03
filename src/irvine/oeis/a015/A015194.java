package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015194 Inverse of <code>1185th</code> cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015194 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015194() {
    super(Cyclotomic.inverse(1185));
  }
}
