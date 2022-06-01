package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A014894 Inverse of 885th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A014894 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014894() {
    super(Cyclotomic.inverse(885));
  }
}
