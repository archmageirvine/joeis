package irvine.oeis.a065;

import irvine.oeis.a000.A000330;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A065739 Largest square &lt;= sum of first n squares.
 * @author Sean A. Irvine
 */
public class A065739 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A065739() {
    super(1, new A000330().skip(), k -> k.sqrt().square());
  }
}
