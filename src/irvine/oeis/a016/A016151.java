package irvine.oeis.a016;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A016151 Inverse of 2142nd cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A016151 extends PeriodicSequence {

  /** Construct the sequence. */
  public A016151() {
    super(Cyclotomic.inverse(2142));
  }
}
