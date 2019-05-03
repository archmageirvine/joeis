package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A014386 Inverse of <code>377th</code> cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A014386 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014386() {
    super(Cyclotomic.inverse(377));
  }
}
