package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A014139 Inverse of <code>130th</code> cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A014139 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014139() {
    super(Cyclotomic.inverse(130));
  }
}
