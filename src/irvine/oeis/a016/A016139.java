package irvine.oeis.a016;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A016139 Inverse of 2130th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A016139 extends PeriodicSequence {

  /** Construct the sequence. */
  public A016139() {
    super(Cyclotomic.inverse(2130));
  }
}
