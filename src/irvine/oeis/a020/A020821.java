package irvine.oeis.a020;

import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A020821 Decimal expansion of <code>1/8</code>.
 * @author Sean A. Irvine
 */
public class A020821 extends PrependSequence {

  /** Construct the sequence. */
  public A020821() {
    super(new PeriodicSequence(0), 1, 2, 5);
  }
}
