package irvine.oeis.a165;
// manually deris/essent at 2022-04-28 12:39

import irvine.oeis.PrependSequence;
import irvine.oeis.a001.A001146;

/**
 * A165420 a(1) = 1, a(2) = 2, a(n) = product of the previous terms for n &gt;= 3.
 * @author Georg Fischer
 */
public class A165420 extends PrependSequence {

  /** Construct the sequence. */
  public A165420() {
    super(new A001146(), 1, 2);
  }
}
