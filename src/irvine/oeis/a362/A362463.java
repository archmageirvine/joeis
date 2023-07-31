package irvine.oeis.a362;
// manually tricut2 2023-07-31

import irvine.oeis.PrependSequence;
import irvine.oeis.a036.A036262;
import irvine.oeis.a059.A059841;
import irvine.oeis.triangle.PrependColumn;

/**
 * A362463 Array of numbers read by upward antidiagonals: leading row lists the primes as they were in the 19th century (A008578); the following rows give absolute values of differences of previous row.
 * @author Georg Fischer
 */
public class A362463 extends PrependColumn {

  /** Construct the sequence. */
  public A362463() {
    super(1, new A036262(), new PrependSequence(new A059841(), 1));
  }
}

