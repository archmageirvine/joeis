package irvine.oeis.a016;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A016023 Inverse of 2014th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A016023 extends PeriodicSequence {

  /** Construct the sequence. */
  public A016023() {
    super(Cyclotomic.inverse(2014));
  }
}
