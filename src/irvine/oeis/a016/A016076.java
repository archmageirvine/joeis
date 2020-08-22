package irvine.oeis.a016;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A016076 Inverse of 2067th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A016076 extends PeriodicSequence {

  /** Construct the sequence. */
  public A016076() {
    super(Cyclotomic.inverse(2067));
  }
}
