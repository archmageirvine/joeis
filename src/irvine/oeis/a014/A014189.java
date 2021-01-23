package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A014189 Inverse of 180th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A014189 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014189() {
    super(Cyclotomic.inverse(180));
  }
}
