package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A014984 Inverse of 975th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A014984 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014984() {
    super(Cyclotomic.inverse(975));
  }
}
