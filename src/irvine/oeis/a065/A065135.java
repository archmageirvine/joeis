package irvine.oeis.a065;

import irvine.math.z.Z;
import irvine.oeis.FilterPositionSequence;

/**
 * A065135 Numbers m such that prime(m) = pi(m)*k + 1 for some k.
 * @author Sean A. Irvine
 */
public class A065135 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A065135() {
    super(1, 2, new A065133(), Z.ONE::equals);
  }
}

