package irvine.oeis.a016;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A016156 Inverse of <code>2147th</code> cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A016156 extends PeriodicSequence {

  /** Construct the sequence. */
  public A016156() {
    super(Cyclotomic.inverse(2147));
  }
}
