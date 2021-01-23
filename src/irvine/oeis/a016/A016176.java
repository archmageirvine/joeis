package irvine.oeis.a016;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A016176 Inverse of 2167th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A016176 extends PeriodicSequence {

  /** Construct the sequence. */
  public A016176() {
    super(Cyclotomic.inverse(2167));
  }
}
