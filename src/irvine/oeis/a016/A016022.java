package irvine.oeis.a016;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A016022 Inverse of 2013th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A016022 extends PeriodicSequence {

  /** Construct the sequence. */
  public A016022() {
    super(Cyclotomic.inverse(2013));
  }
}
