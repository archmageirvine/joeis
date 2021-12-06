package irvine.oeis.a326;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A326012 a(n) = (n+1)*(n+2)/2 * (2^n + 1)^n.
 * @author Georg Fischer
 */
public class A326012 implements Sequence {

  protected int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Z.ONE.shiftLeft(mN).add(1).pow(mN).multiply(mN + 1).multiply(mN + 2).divide2();
  }
}
