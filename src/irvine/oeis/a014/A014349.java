package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A014349 Inverse of <code>340th</code> cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A014349 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014349() {
    super(Cyclotomic.inverse(340));
  }
}
