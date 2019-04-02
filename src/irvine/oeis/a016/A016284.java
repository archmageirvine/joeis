package irvine.oeis.a016;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A016284 Inverse of 2275th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A016284 extends PeriodicSequence {

  /** Construct the sequence. */
  public A016284() {
    super(Cyclotomic.inverse(2275));
  }
}
