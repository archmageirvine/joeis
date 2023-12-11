package irvine.oeis.a021;

import irvine.oeis.PrependSequence;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A021206 Decimal expansion of 1/202.
 * @author Sean A. Irvine
 */
public class A021206 extends PrependSequence {

  /** Construct the sequence. */
  public A021206() {
    super(new PeriodicSequence(0, 4, 9, 5), 0);
  }
}
