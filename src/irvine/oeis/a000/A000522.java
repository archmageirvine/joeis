package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A000522 Total number of ordered k-tuples (k=0..n) of distinct elements from an n-element set: a(n) = Sum_{k=0..n} n!/k!.
 * @author Sean A. Irvine
 */
public class A000522 extends AbstractSequence {

  /** Construct the sequence. */
  public A000522() {
    super(0);
  }

  private Z mA = Z.ZERO;
  private int mN = -1;

  @Override
  public Z next() {
    mA = mA.multiply(++mN).add(1);
    return mA;
  }
}
