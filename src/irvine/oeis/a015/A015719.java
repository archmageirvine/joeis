package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015719 Inverse of <code>1710th</code> cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A015719 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015719() {
    super(Cyclotomic.inverse(1710));
  }
}
