package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A014308 Inverse of 299th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A014308 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014308() {
    super(Cyclotomic.inverse(299));
  }
}
