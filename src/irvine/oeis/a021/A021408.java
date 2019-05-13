package irvine.oeis.a021;

import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A021408 Decimal expansion of 1/404.
 * @author Sean A. Irvine
 */
public class A021408 extends PrependSequence {

  /** Construct the sequence. */
  public A021408() {
    super(new PeriodicSequence(2, 4, 7, 5), 0, 0);
  }
}
