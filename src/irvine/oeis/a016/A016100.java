package irvine.oeis.a016;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A016100 Inverse of 2091st cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A016100 extends PeriodicSequence {

  /** Construct the sequence. */
  public A016100() {
    super(Cyclotomic.inverse(2091));
  }
}
