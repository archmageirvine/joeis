package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A014139 Inverse of 130th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A014139 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014139() {
    super(Cyclotomic.inverse(130));
  }
}
