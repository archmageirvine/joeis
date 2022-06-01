package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A014147 Inverse of 138th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A014147 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014147() {
    super(Cyclotomic.inverse(138));
  }
}
