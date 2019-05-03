package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A014654 Inverse of <code>645th</code> cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A014654 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014654() {
    super(Cyclotomic.inverse(645));
  }
}
