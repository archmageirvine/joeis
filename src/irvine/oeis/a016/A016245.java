package irvine.oeis.a016;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A016245 Inverse of 2236th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A016245 extends PeriodicSequence {

  /** Construct the sequence. */
  public A016245() {
    super(Cyclotomic.inverse(2236));
  }
}
