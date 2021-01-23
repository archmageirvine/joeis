package irvine.oeis.a016;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A016155 Inverse of 2146th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A016155 extends PeriodicSequence {

  /** Construct the sequence. */
  public A016155() {
    super(Cyclotomic.inverse(2146));
  }
}
