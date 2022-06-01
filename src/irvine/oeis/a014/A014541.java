package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A014541 Inverse of 532nd cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A014541 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014541() {
    super(Cyclotomic.inverse(532));
  }
}
