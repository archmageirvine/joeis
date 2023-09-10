package irvine.oeis.a065;

import irvine.oeis.a001.A001157;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A065741 Largest square &lt;= sum of squares of divisors of n.
 * @author Sean A. Irvine
 */
public class A065741 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A065741() {
    super(1, new A001157(), k -> k.sqrt().square());
  }
}
