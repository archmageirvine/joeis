package irvine.oeis.a057;
// manually A057036/parmof4 at 2023-07-17 09:13

import irvine.math.z.Z;

/**
 * A057058 Let R(i,j) be the rectangle with antidiagonals 1; 2,3; 4,5,6; ...; each k is an R(i(k),j(k)) and a(n)=i(A057027(n))
 * @author Georg Fischer
 */
public class A057058 extends A057036 {

  /** Construct the sequence. */
  public A057058() {
    this(1);
  }

  /**
   * Generic constructor with parameters
   * @param mode 1: return <code>i</code>, 2: return <code>j</code>
   */
  public A057058(final int mode) {
    super(1, new A057027(), mode, 0);
  }

  @Override
  public Z next() {
    final Z k = mSeq.next();
    mTri = Z.ONE;
    mTrix = 1;
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
