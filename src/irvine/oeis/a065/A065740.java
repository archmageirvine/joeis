package irvine.oeis.a065;

import irvine.oeis.a000.A000312;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A065740 Largest square &lt;= n^n.
 * @author Sean A. Irvine
 */
public class A065740 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A065740() {
    super(1, new A000312().skip(), k -> k.sqrt().square());
  }
}
