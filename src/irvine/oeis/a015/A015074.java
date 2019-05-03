package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015074 Inverse of <code>1065th</code> cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015074 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015074() {
    super(Cyclotomic.inverse(1065));
  }
}
