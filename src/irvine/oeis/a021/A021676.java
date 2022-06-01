package irvine.oeis.a021;

import irvine.oeis.recur.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A021676 Decimal expansion of 1/672.
 * @author Sean A. Irvine
 */
public class A021676 extends PrependSequence {

  /** Construct the sequence. */
  public A021676() {
    super(new PeriodicSequence(8, 0, 9, 5, 2, 3), 0, 0, 1, 4, 8);
  }
}

