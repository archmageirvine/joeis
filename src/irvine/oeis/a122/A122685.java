package irvine.oeis.a122;
// manually deris/essent at 2022-04-27 19:28

import irvine.oeis.PrependSequence;
import irvine.oeis.a005.A005212;

/**
 * A122685 a(n) = n! except that a(2) = -2 and a(2n) = 0 for n &gt; 2.
 * @author Georg Fischer
 */
public class A122685 extends PrependSequence {

  /** Construct the sequence. */
  public A122685() {
    super(new A005212().skip(3), 1, 1, -2);
  }
}
