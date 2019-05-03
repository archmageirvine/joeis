package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015044 Inverse of <code>1035th</code> cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015044 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015044() {
    super(Cyclotomic.inverse(1035));
  }
}
