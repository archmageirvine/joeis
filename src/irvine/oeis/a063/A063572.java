package irvine.oeis.a063;

import irvine.oeis.PrependSequence;
import irvine.oeis.a062.A062526;

/**
 * A063572 Smallest power of 9 having n in its decimal representation.
 * @author Sean A. Irvine
 */
public class A063572 extends PrependSequence {

  /** Construct the sequence. */
  public A063572() {
    super(new A062526().skip(2), 5, 2);
  }
}
