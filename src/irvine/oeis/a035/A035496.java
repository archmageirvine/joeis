package irvine.oeis.a035;

import java.util.TreeSet;

import irvine.math.z.Z;

/**
 * A035496 Numbers of the form x*y^2 + y*z^2 + z*x^2, x,y,z &gt;= 1.
 * @author Sean A. Irvine
 */
public class A035496 extends A035485 {

  /** Construct the sequence. */
  public A035496() {
    super(1);
  }

  private final TreeSet<Z> mA = new TreeSet<>();
  private long mX = 1;

  @Override
  public Z next() {
    if (mA.isEmpty() || mA.first().compareTo(Z.valueOf(mX * mX + mX)) > 0) {
      for (long y = 1; y <= mX; ++y) {
        for (long z = 1; z <= mX; ++z) {
          mA.add(Z.valueOf(mX * y * y + y * z * z + z * mX * mX));
        }
      }
      ++mX;
    }
    return mA.pollFirst();
  }
}

