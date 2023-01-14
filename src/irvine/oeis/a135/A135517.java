package irvine.oeis.a135;
// manually A135416/parm3 at 2022-12-20 16:28

import irvine.math.z.Z;

/**
 * A135517 a(n) = 2^(A091090(n)-1).
 * @author Georg Fischer
 */
public class A135517 extends A135416 {

  private int mN = -1;
  private final A135416 mSeq = new A135416(2, 5);

  @Override
  public int getOffset() {
    return 0;
  }

  @Override
  public Z next() {
    ++mN;
    return (mN == 0) ? Z.ONE : mSeq.next();
  }
}
