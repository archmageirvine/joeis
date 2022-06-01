package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A014503 Inverse of 494th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A014503 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014503() {
    super(Cyclotomic.inverse(494));
  }
}
