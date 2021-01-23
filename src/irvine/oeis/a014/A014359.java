package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A014359 Inverse of 350th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A014359 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014359() {
    super(Cyclotomic.inverse(350));
  }
}
