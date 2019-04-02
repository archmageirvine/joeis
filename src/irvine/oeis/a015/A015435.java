package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015435 Inverse of 1426th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015435 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015435() {
    super(Cyclotomic.inverse(1426));
  }
}
