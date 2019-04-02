package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015127 Inverse of 1118th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015127 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015127() {
    super(Cyclotomic.inverse(1118));
  }
}
