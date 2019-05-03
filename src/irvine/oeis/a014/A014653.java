package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A014653 Inverse of <code>644th</code> cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A014653 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014653() {
    super(Cyclotomic.inverse(644));
  }
}
