package irvine.oeis.a016;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A016022 Inverse of <code>2013th</code> cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A016022 extends PeriodicSequence {

  /** Construct the sequence. */
  public A016022() {
    super(Cyclotomic.inverse(2013));
  }
}
