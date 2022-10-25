package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.StanleySequence;

/**
 * A005487 Starts 0, 4 and contains no 3-term arithmetic progression.
 * @author Sean A. Irvine
 */
public class A005487 extends StanleySequence {

  /** Construct the sequence. */
  public A005487() {
    super(Z.ZERO, Z.FOUR);
    setOffset(0);
  }
}
