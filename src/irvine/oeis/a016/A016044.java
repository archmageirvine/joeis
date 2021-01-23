package irvine.oeis.a016;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A016044 Inverse of 2035th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A016044 extends PeriodicSequence {

  /** Construct the sequence. */
  public A016044() {
    super(Cyclotomic.inverse(2035));
  }
}
