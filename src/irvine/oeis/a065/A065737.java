package irvine.oeis.a065;

import irvine.oeis.a000.A000217;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A065737 Largest square &lt;= binomial(n,2).
 * @author Sean A. Irvine
 */
public class A065737 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A065737() {
    super(1, new A000217(), k -> k.sqrt().square());
  }
}
