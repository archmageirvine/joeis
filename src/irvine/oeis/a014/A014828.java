package irvine.oeis.a014;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A014828 Inverse of <code>819th</code> cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A014828 extends PeriodicSequence {

  /** Construct the sequence. */
  public A014828() {
    super(Cyclotomic.inverse(819));
  }
}
