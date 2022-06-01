package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A015074 Inverse of 1065th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015074 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015074() {
    super(Cyclotomic.inverse(1065));
  }
}
