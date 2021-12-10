package irvine.oeis.a002;

import irvine.oeis.GeneratingFunctionSequence;
import irvine.oeis.transform.InverseMobiusTransformSequence;

/**
 * A002791 a(n) = Sum_{d|n, d &lt;= 4} d^2 + 4*Sum_{d|n, d&gt;4} d.
 * @author Sean A. Irvine
 */
public class A002791 extends InverseMobiusTransformSequence {

  /** Construct the sequence. */
  public A002791() {
    super(new GeneratingFunctionSequence(new long[] {1, 2, 2, 2, -3},
      new long[] {1, -2, 1}), 0);
    next();
  }
}
