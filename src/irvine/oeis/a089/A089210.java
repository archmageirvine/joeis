package irvine.oeis.a089;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A089210 a(n) = n^(n^(n-1)).
 * @author Georg Fischer
 */
public class A089210 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    final Z n = Z.valueOf(++mN);
    return n.pow(n.pow(mN - 1));
  }
}
