package irvine.oeis.a085;

import irvine.oeis.PrependSequence;
import irvine.oeis.a000.A000217;
import irvine.oeis.closure.MultiplicativeClosureSequence;

/**
 * A085780.
 * @author Sean A. Irvine
 */
public class A085782 extends PrependSequence {

  /** Construct the sequence. */
  public A085782() {
    super(1, new MultiplicativeClosureSequence(new A000217().skip(2)), 0);
  }
}
