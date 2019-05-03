package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A014786 Inverse of <code>777th</code> cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A014786 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014786() {
    super(Cyclotomic.inverse(777));
  }
}
