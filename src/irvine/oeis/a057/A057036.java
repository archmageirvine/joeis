package irvine.oeis.a057;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a005.A005408;

/**
 * A057036 Let R(i,j) be the rectangle with antidiagonals 1; 2,3; 4,5,6; ...; each k is an R(i(k),j(k)) and A057036(n)=i(2n-1).
 * @author Georg Fischer
 */
public class A057036 implements Sequence {

  protected Z mTri; // smallest triangular number >= mN
  protected long mTrix; // index of that largest triangular number
  protected Sequence mSeq; // underlying sequence
  protected int mMode; // 1: return <code>i</code>, 2: return <code>j</code>, 3: return antidiagonal's number

  /** Construct the sequence. */
  public A057036() {
    this(new A005408(), 1, 0); // odd numbers 1, 3, 5...
  }

  /**
   * Generic constructor with parameters
   * @param seq underlying sequence
   * @param mode 1: return <code>i</code>, 2: return <code>j</code>, 3: return antidiagonal's number
   * @param skip number of terms of the underlying sequence to be skipped initially
   */
  public A057036(final Sequence seq, final int mode, int skip) {
    mSeq = seq;
    while (skip > 0) {
      mSeq.next();
      --skip;
    }
    mMode = mode;
    mTri = Z.ONE;
    mTrix = 1;
  }

  @Override
  public Z next() {
    final Z k = mSeq.next();
    while (k.compareTo(mTri) > 0) {
      ++mTrix;
      mTri = mTri.add(mTrix);
    }
    // now k <= mTri
    final long dist = mTri.subtract(k).longValue();
    final long i = mTrix - dist;
    final long j = dist + 1;
    if (mMode == 1) {
      return Z.valueOf(i);
    } else if (mMode == 2) {
      return Z.valueOf(j);
    } else if (mMode == 3) {
      return Z.valueOf(mTrix);
    }
    return Z.ZERO;
  }
}
