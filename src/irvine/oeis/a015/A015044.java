package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015044 Inverse of 1035th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015044 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015044() {
    super(Cyclotomic.inverse(1035));
  }
}
