package irvine.oeis.a242;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A242232 a(n) = 2*a(n-1)^2 - 1, a(0)=6.
 * @author Georg Fischer
 */
public class A242232 implements Sequence {

  private Z mA;

  /** Construct the sequence. */
  public A242232() {
    mA = Z.SIX;
  }

  @Override
  public Z next() {
    final Z result = mA;
    mA = mA.square().multiply2().subtract(1);
    return result;
  }
}
