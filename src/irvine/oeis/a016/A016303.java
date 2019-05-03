package irvine.oeis.a016;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A016303 Inverse of <code>2294th</code> cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A016303 extends PeriodicSequence {

  /** Construct the sequence. */
  public A016303() {
    super(Cyclotomic.inverse(2294));
  }
}
