package irvine.oeis.a063;

import irvine.oeis.PrependSequence;
import irvine.oeis.a062.A062521;

/**
 * A063567 Smallest positive power of 4 having n in its decimal representation.
 * @author Sean A. Irvine
 */
public class A063567 extends PrependSequence {

  /** Construct the sequence. */
  public A063567() {
    super(new A062521().skip(2), 5, 2);
  }
}
