package irvine.oeis.a016;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A016083 Inverse of 2074th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A016083 extends PeriodicSequence {

  /** Construct the sequence. */
  public A016083() {
    super(Cyclotomic.inverse(2074));
  }
}
