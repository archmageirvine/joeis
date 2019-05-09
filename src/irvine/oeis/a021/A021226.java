package irvine.oeis.a021;

import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A021226 Decimal expansion of 1/222.
 * @author Sean A. Irvine
 */
public class A021226 extends PrependSequence {

  /** Construct the sequence. */
  public A021226() {
    super(new PeriodicSequence(0, 4, 5), 0);
  }
}
