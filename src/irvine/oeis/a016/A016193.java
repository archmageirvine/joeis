package irvine.oeis.a016;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A016193 Inverse of 2184th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A016193 extends PeriodicSequence {

  /** Construct the sequence. */
  public A016193() {
    super(Cyclotomic.inverse(2184));
  }
}
