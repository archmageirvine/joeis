package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A014879 Inverse of 870th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A014879 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014879() {
    super(Cyclotomic.inverse(870));
  }
}
