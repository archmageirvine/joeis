package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A014653 Inverse of 644th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A014653 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014653() {
    super(Cyclotomic.inverse(644));
  }
}
