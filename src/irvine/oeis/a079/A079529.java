package irvine.oeis.a079;

import irvine.math.function.Functions;
import irvine.oeis.a002.A002808;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A079529 a(n) = sigma(n) - ceiling(n + sqrt n) as n runs through the composite numbers A002808.
 * @author Sean A. Irvine
 */
public class A079529 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A079529() {
    super(1, new A002808(), k -> Functions.SIGMA1.z(k).subtract(Functions.CEIL_SQRT.z(k).add(k)));
  }
}
