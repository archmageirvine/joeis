package irvine.oeis.a253;
// manually deris/essent at 2022-04-28 15:40

import irvine.oeis.PrependSequence;
import irvine.oeis.a055.A055266;

/**
 * A253074 Lexicographically earliest sequence of distinct numbers such that a(n-1)+a(n) is not prime.
 * @author Georg Fischer
 */
public class A253074 extends PrependSequence {

  /** Construct the sequence. */
  public A253074() {
    super(new A055266(), 0);
  }
}
