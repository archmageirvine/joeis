package irvine.oeis.a341;
// manually deris/essent at 2022-04-28 15:40

import irvine.oeis.PrependSequence;
import irvine.oeis.a051.A051950;

/**
 * A341062 Sequence whose partial sums give A000005.
 * @author Georg Fischer
 */
public class A341062 extends PrependSequence {

  /** Construct the sequence. */
  public A341062() {
    super(1, new A051950(), 1);
  }
}
