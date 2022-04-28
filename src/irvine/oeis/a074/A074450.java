package irvine.oeis.a074;
// manually deris/essent at 2022-04-27 19:28

import irvine.oeis.PrependSequence;

/**
 * A074450 Let x = RootOf(z^2 + z + 1) and y = 1+x. Number of 4-ary Lyndon words of length n over GF(4) with trace 1 and subtrace x.
 * @author Georg Fischer
 */
public class A074450 extends PrependSequence {

  /** Construct the sequence. */
  public A074450() {
    super(0, new A074032());
  }
}
