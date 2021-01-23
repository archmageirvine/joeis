package irvine.oeis.a016;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A016236 Inverse of 2227th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A016236 extends PeriodicSequence {

  /** Construct the sequence. */
  public A016236() {
    super(Cyclotomic.inverse(2227));
  }
}
