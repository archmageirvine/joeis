package irvine.oeis.a065;

import irvine.oeis.a000.A000984;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A065738 Largest square &lt;= binomial(2n,n).
 * @author Sean A. Irvine
 */
public class A065738 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A065738() {
    super(0, new A000984(), k -> k.sqrt().square());
  }
}
