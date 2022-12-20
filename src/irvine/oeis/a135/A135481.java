package irvine.oeis.a135;
// manually A135416/parm3 at 2022-12-20 16:28

import irvine.math.z.Z;

/**
 * A135481 a(n) = 2^A007814(n+1) - 1.
 * This is Guy Steele's sequence GS(1, 6) (see A135416).
 * @author Georg Fischer
 */
public class A135481 extends A135416 {

  private int mN = -1;
  private final A135416 mSeq = new A135416(1, 6);

  @Override
  public Z next() {
    ++mN;
    return (mN == 0) ? Z.ZERO : mSeq.next();
  }
}
