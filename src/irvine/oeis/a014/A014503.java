package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A014503 Inverse of <code>494th</code> cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A014503 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014503() {
    super(Cyclotomic.inverse(494));
  }
}
