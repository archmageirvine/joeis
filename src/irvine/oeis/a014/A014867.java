package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A014867 Inverse of 858th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A014867 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014867() {
    super(Cyclotomic.inverse(858));
  }
}
