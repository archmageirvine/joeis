package irvine.oeis.a016;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A016199 Inverse of 2190th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A016199 extends PeriodicSequence {

  /** Construct the sequence. */
  public A016199() {
    super(Cyclotomic.inverse(2190));
  }
}
