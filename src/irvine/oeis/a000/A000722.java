package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A000722 Number of invertible Boolean functions of n variables: a(n) = (2^n)!.
 * @author Sean A. Irvine
 */
public class A000722 extends AbstractSequence {

  /** Construct the sequence. */
  public A000722() {
    super(0);
  }

  int mN = -1;

  @Override
  public Z next() {
    int f = 1 << ++mN;
    Z p = Z.ONE;
    while (f > 1) {
      p = p.multiply(f--);
    }
    return p;
  }
}
