package irvine.oeis.a061;

import irvine.math.z.Z;

/**
 * A061087 a(n) = A061086(n) / n.
 * @author Georg Fischer
 */
public class A061087 extends A061086 {

  private long mN = 0;

  @Override
  public Z next() {
    return super.next().divide(++mN);
  }
}
