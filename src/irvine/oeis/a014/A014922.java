package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A014922 Inverse of <code>913th</code> cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A014922 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014922() {
    super(Cyclotomic.inverse(913));
  }
}
