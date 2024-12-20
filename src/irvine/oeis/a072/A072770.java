package irvine.oeis.a072;

import irvine.math.z.Z;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A072770 Triangle A072768 computed modulo 2.
 * @author Sean A. Irvine
 */
public class A072770 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A072770() {
    super(1, new A072768(), Z.ONE::and);
  }
}
