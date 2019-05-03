package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A014416 Inverse of <code>407th</code> cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A014416 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014416() {
    super(Cyclotomic.inverse(407));
  }
}
