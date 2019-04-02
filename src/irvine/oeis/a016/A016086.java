package irvine.oeis.a016;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A016086 Inverse of 2077th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A016086 extends PeriodicSequence {

  /** Construct the sequence. */
  public A016086() {
    super(Cyclotomic.inverse(2077));
  }
}
