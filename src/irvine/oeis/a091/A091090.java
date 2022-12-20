package irvine.oeis.a091;
// manually A135416/parm3 at 2022-12-20 16:28

import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.oeis.a135.A135416;

/**
 * A091090 In binary representation: number of editing steps (delete, insert, or substitute) to transform n into n + 1.
 * @author Georg Fischer
 */
public class A091090 extends Sequence0 {

  private int mN = -1;
  private final A135416 mSeq = new A135416(2, 4);

  @Override
  public Z next() {
    ++mN;
    return (mN == 0) ? Z.ONE : mSeq.next();
  }
}
