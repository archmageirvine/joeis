package irvine.oeis.a021;

import irvine.oeis.recur.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A021022 Decimal expansion of 1/18.
 * @author Sean A. Irvine
 */
public class A021022 extends PrependSequence {

  /** Construct the sequence. */
  public A021022() {
    super(new PeriodicSequence(5), 0);
  }
}
