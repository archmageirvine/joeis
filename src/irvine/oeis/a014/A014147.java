package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A014147 Inverse of <code>138th</code> cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A014147 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014147() {
    super(Cyclotomic.inverse(138));
  }
}
