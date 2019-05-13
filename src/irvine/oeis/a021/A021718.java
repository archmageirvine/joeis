package irvine.oeis.a021;

import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A021718 Decimal expansion of 1/714.
 * @author Sean A. Irvine
 */
public class A021718 extends PrependSequence {

  /** Construct the sequence. */
  public A021718() {
    super(new PeriodicSequence(0, 1, 4, 0, 0, 5, 6, 0, 2, 2, 4, 0, 8, 9, 6, 3, 5, 8, 5, 4, 3, 4, 1, 7, 3, 6, 6, 9, 4, 6, 7, 7, 8, 7, 1, 1, 4, 8, 4, 5, 9, 3, 8, 3, 7, 5, 3, 5), 0);
  }
}

