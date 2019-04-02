package irvine.oeis.a016;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A016148 Inverse of 2139th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A016148 extends PeriodicSequence {

  /** Construct the sequence. */
  public A016148() {
    super(Cyclotomic.inverse(2139));
  }
}
