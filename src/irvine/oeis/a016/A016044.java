package irvine.oeis.a016;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A016044 Inverse of <code>2035th</code> cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A016044 extends PeriodicSequence {

  /** Construct the sequence. */
  public A016044() {
    super(Cyclotomic.inverse(2035));
  }
}
