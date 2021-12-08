package irvine.oeis.a060;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a006.A006017;

/**
 * A060147 Nim-binomial transform of the Nim-squares sequence {0, 1, 3, 2, 6, 7, 5, 4, 13, 12, 14,...}.
 * a(2^e) = A006017(e), a(p^e) = 0 otherwise.
 * @author Georg Fischer
 */
public class A060147 implements Sequence {

  private int mN;
  private long mP2; // powers of 2
  private Sequence mSeq;

  /** Construct the sequence. */
  public A060147() {
    mN = -1;
    mP2 = 1;
    mSeq = new A006017();
  }

  @Override
  public Z next() {
    ++mN;
    if (mN == mP2) {
      mP2 <<= 1;
      return mSeq.next();
    } else {
      return Z.ZERO;
    }
  }
}
