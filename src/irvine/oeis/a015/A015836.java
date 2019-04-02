package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015836 Inverse of 1827th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015836 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015836() {
    super(Cyclotomic.inverse(1827));
  }
}
