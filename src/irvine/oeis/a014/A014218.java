package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A014218 Inverse of <code>209th</code> cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A014218 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014218() {
    super(Cyclotomic.inverse(209));
  }
}
