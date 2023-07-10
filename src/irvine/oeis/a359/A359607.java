package irvine.oeis.a359;
// manually at 2023-07-09 21:27

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.a353.A353557;
import irvine.oeis.a358.A358777;

/**
 * A359607 Terms of A046337 for which A358777 is zero, where the latter is the Dirichlet inverse of former&apos;s characteristic function.
 * @author Georg Fischer
 */
public class A359607 extends Sequence1 {

  private int mN = 0;
  private final A353557 mSeq1 = new A353557();
  private final A358777 mSeq2 = new A358777();

  @Override
  public Z next() {
    // isA359607(n) = (A353557(n) && !A358777(n));
    while (true) {
      ++mN;
      final Z t1 = mSeq1.next();
      final Z t2 = mSeq2.next();
      if (!t1.isZero() && t2.isZero()) {
        return Z.valueOf(mN);
      }
    }
  }
}
