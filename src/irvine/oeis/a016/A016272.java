package irvine.oeis.a016;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A016272 Inverse of 2263rd cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A016272 extends PeriodicSequence {

  /** Construct the sequence. */
  public A016272() {
    super(Cyclotomic.inverse(2263));
  }
}
