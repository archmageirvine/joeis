package irvine.oeis.a016;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A016055 Inverse of 2046th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A016055 extends PeriodicSequence {

  /** Construct the sequence. */
  public A016055() {
    super(Cyclotomic.inverse(2046));
  }
}
