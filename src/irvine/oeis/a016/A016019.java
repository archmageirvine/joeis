package irvine.oeis.a016;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A016019 Inverse of 2010th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A016019 extends PeriodicSequence {

  /** Construct the sequence. */
  public A016019() {
    super(Cyclotomic.inverse(2010));
  }
}
