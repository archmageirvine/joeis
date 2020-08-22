package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015624 Inverse of 1615th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015624 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015624() {
    super(Cyclotomic.inverse(1615));
  }
}
