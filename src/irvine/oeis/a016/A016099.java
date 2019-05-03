package irvine.oeis.a016;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A016099 Inverse of <code>2090th</code> cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A016099 extends PeriodicSequence {

  /** Construct the sequence. */
  public A016099() {
    super(Cyclotomic.inverse(2090));
  }
}
