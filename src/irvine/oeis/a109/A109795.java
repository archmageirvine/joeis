package irvine.oeis.a109;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A109795 a(n)= n*(1+floor(n/10)).
 * @author Georg Fischer
 */
public class A109795 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    return Z.valueOf(mN).multiply(mN / 10 + 1);
  }
}
