package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A014821 Inverse of 812th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A014821 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014821() {
    super(Cyclotomic.inverse(812));
  }
}
