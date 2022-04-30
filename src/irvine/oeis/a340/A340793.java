package irvine.oeis.a340;
// manually deris/essent at 2022-04-28 15:40

import irvine.oeis.PrependSequence;
import irvine.oeis.a053.A053222;

/**
 * A340793 Sequence whose partial sums give A000203.
 * @author Georg Fischer
 */
public class A340793 extends PrependSequence {

  /** Construct the sequence. */
  public A340793() {
    super(new A053222(), 1);
  }
}
