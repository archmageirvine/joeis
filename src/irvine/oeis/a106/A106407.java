package irvine.oeis.a106;
// manually etman at 2023-02-01 22:30

import irvine.oeis.a209.A209229;
import irvine.oeis.transform.EulerTransform;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A106407 Expansion of x((1-x)(1-x^2)(1-x^4)(1-x^8)...)^2.
 * @author Georg Fischer
 */
public class A106407 extends EulerTransform {

  /** Construct the sequence. */
  public A106407() {
    super(1, new SimpleTransformSequence(new A209229().skip(), k -> k.multiply(-2)), 1);
  }
}
