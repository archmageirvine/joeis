package irvine.oeis.a020;

import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A020793 Decimal expansion of <code>1/6</code>.
 * @author Sean A. Irvine
 */
public class A020793 extends PrependSequence {

  /** Construct the sequence. */
  public A020793() {
    super(new PeriodicSequence(6), 1);
  }
}
