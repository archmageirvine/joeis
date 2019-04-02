package irvine.oeis.a016;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A016053 Inverse of 2044th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A016053 extends PeriodicSequence {

  /** Construct the sequence. */
  public A016053() {
    super(Cyclotomic.inverse(2044));
  }
}
