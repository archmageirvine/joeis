package irvine.oeis.a326;
// manually 2021-06-13

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A326501 a(n) = Sum_{k=0..n} (-k)^k.
 * @author Georg Fischer
 */
public class A326501 implements Sequence {

  private Z mAn;
  private int mN;

  /** Construct the sequence. */
  public A326501() {
    mAn = Z.ONE;
    mN = 0;
  }

  @Override
  public Z next() {
    final Z result = mAn;
    ++mN;
    mAn = mAn.add(Z.valueOf(-mN).pow(mN));
    return result;
  }
}
