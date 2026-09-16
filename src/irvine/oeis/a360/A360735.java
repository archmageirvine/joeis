package irvine.oeis.a360;

import irvine.math.z.Z;
import irvine.oeis.a399.A399582;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A360735 Even integers d such that the longest possible arithmetic progression (AP) of primes with common difference d has only two elements.
 * @author Sean A. Irvine
 */
public class A360735 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A360735() {
    super(1, new A399582(), Z::multiply2);
  }
}
