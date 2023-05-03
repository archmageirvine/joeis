package irvine.oeis.a063;

import irvine.oeis.PrependSequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a062.A062521;

/**
 * A063567 Smallest positive power of 4 having n in its decimal representation.
 * @author Sean A. Irvine
 */
public class A063567 extends PrependSequence {

  /** Construct the sequence. */
  public A063567() {
    super(new SkipSequence(new A062521(), 2), 5, 2);
  }
}
