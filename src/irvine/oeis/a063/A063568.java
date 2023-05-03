package irvine.oeis.a063;

import irvine.oeis.PrependSequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a062.A062522;

/**
 * A063568 5^a(n) is the smallest positive power of 5 having n in its decimal representation.
 * @author Sean A. Irvine
 */
public class A063568 extends PrependSequence {

  /** Construct the sequence. */
  public A063568() {
    super(new SkipSequence(new A062522(), 2), 8, 3);
  }
}
