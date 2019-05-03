package irvine.oeis.a016;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A016117 Inverse of <code>2108th</code> cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A016117 extends PeriodicSequence {

  /** Construct the sequence. */
  public A016117() {
    super(Cyclotomic.inverse(2108));
  }
}
