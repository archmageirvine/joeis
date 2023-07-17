package irvine.oeis.a030;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.a000.A000295;
import irvine.oeis.a008.A008292;

/**
 * A030196 Distinct elements occurring in triangle of Eulerian numbers (sorted).
 * @author Sean A. Irvine
 */
public class A030196 extends A000295 {

  /** Construct the sequence. */
  public A030196() {
    super(1);
  }

  private final A008292 mEuler = new A008292();
  private final TreeSet<Z> mS = new TreeSet<>();
  private long mRow = 0;
  private Z mA = super.next();

  {
    next();
    next();
    mS.add(Z.ONE);
  }

  @Override
  public Z next() {
    if (mS.isEmpty() || mS.first().compareTo(mA) <= 0) {
      ++mRow;
      for (long col = 2; col <= (mRow + 1) / 2; ++col) {
        mS.add(mEuler.get(mRow, col));
      }
      mA = super.next();
    }
    return mS.pollFirst();
  }
}
