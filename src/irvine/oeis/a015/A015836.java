package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015836 Inverse of <code>1827th</code> cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015836 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015836() {
    super(Cyclotomic.inverse(1827));
  }
}
