package irvine.oeis.a021;

import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A021072 Decimal expansion of 1/68.
 * @author Sean A. Irvine
 */
public class A021072 extends PrependSequence {

  /** Construct the sequence. */
  public A021072() {
    super(new PeriodicSequence(4, 7, 0, 5, 8, 8, 2, 3, 5, 2, 9, 4, 1, 1, 7, 6), 0, 1);
  }
}
