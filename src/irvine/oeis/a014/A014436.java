package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A014436 Inverse of <code>427th</code> cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A014436 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014436() {
    super(Cyclotomic.inverse(427));
  }
}
