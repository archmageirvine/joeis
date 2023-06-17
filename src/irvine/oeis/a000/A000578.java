package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A000578 The cubes: a(n) = n^3.
 * @author Sean A. Irvine
 */
public class A000578 extends AbstractSequence {

  /** Construct the sequence. */
  public A000578() {
    super(0);
  }

  private long mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(++mN).pow(3);
  }
}
