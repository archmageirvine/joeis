package irvine.oeis.a180;
// manually deris2/essent at 2021-11-04

import irvine.oeis.PrependSequence;
import irvine.oeis.a036.A036441;

/**
 * A180107 Partial sums of terms in A180101.
 * Apart from initial terms, same as A036441 and A076271, but the simple definition warrants an independent entry.
 * @author Georg Fischer
 */
public class A180107 extends PrependSequence {

  /** Construct the sequence. */
  public A180107() {
    super(new A036441(), 0, 1, 1);
  }
}
