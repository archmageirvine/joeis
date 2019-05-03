package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A014515 Inverse of <code>506th</code> cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A014515 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014515() {
    super(Cyclotomic.inverse(506));
  }
}
