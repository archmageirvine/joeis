package irvine.oeis.a237;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000041;

/**
 * A237276 Numbers k such that A000041(k) == 1 (mod 3).
 * @author Georg Fischer
 */
public class A237276 extends Sequence1 {

  private int mN;
  private final Z mRes;
  private final Z mMod;
  private final A000041 mSeq = new A000041();

  protected A237276(final int res, final int mod) {
    mN = -1;
    mRes = Z.valueOf(res);
    mMod = Z.valueOf(mod);
  }

  /** Construct the sequence. */
  public A237276() {
    this(1, 3);
  }

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (mSeq.next().mod(mMod).equals(mRes)) {
        return Z.valueOf(mN);
      }
    }
  }
}
