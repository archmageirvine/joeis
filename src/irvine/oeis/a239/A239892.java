package irvine.oeis.a239;
// manually robots/union2 at 2023-08-23 09:55

import irvine.oeis.PrependSequence;
import irvine.oeis.UnionSequence;
import irvine.oeis.a000.A000668;
import irvine.oeis.a002.A002884;

/**
 * A239892 List of orders of finite simple groups which are unit groups of rings.
 * @author Georg Fischer
 */
public class A239892 extends UnionSequence {

  /** Construct the sequence. */
  public A239892() {
    super(1, new PrependSequence(new A000668(), 2), new A002884().skip(3));
  }
}
