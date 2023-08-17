package irvine.oeis.a065;

import irvine.math.z.Z;
import irvine.oeis.FilterPositionSequence;

/**
 * A065136 Numbers n such that n = pi(n)*k + 1 for some k.
 * @author Sean A. Irvine
 */
public class A065136 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A065136() {
    super(1, 2, new A065134(), Z.ONE::equals);
  }
}

