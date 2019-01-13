package irvine.oeis.a015;

import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.PeriodicSequence;

/**
 * A015624.
 * @author Sean A. Irvine
 */
public class A015624 extends PeriodicSequence {

  /** Construct the sequence. */
  public A015624() {
    super(Cyclotomic.inverse(1615));
  }
}
