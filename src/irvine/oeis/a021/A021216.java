package irvine.oeis.a021;

import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A021216 Decimal expansion of 1/212.
 * @author Sean A. Irvine
 */
public class A021216 extends PrependSequence {

  /** Construct the sequence. */
  public A021216() {
    super(new PeriodicSequence(4, 7, 1, 6, 9, 8, 1, 1, 3, 2, 0, 7, 5), 0, 0);
  }
}
