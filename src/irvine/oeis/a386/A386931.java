package irvine.oeis.a386;

import irvine.math.z.Z;
import irvine.oeis.a076.A076115;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A386931 a(n) is the smallest positive integer k such that k^2 is equal to the sum of n consecutive positive integers, or 0 if no such k exists.
 * @author Sean A. Irvine
 */
public class A386931 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A386931() {
    super(1, new A076115(), Z::sqrt);
  }
}
