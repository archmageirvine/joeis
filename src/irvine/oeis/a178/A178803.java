package irvine.oeis.a178;

import irvine.math.function.Functions;
import irvine.oeis.a036.A036043;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A178803 Irregular triangle: T(n,k) is the factorial of the number of parts in the k-th partition of n listed in Abramowitz and Stegun order, read by rows, 1 &lt;= k &lt;= A000041(n).
 * @author Georg Fischer
 */
public class A178803 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A178803() {
    super(0, new A036043(), Functions.FACTORIAL::z);
  }
}
