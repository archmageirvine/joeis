package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A014247 Inverse of <code>238th</code> cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A014247 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014247() {
    super(Cyclotomic.inverse(238));
  }
}
