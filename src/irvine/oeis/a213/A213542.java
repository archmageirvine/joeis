package irvine.oeis.a213;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A213542 a(n) = k AND k^k, where k=2*n+1, AND is the bitwise AND operator.
 * @author Georg Fischer
 */
public class A213542 implements Sequence {

  protected int mN = -1;

  @Override
  public Z next() {
    ++mN;
    final Z k = Z.valueOf(2L * mN + 1);
    return k.and(k.pow(k));
  }
}
