package irvine.oeis.a082;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A082871 First component x of pairs (x,y) where x &lt;= y and x!+y! is a square, sorted on x.
 * @author Sean A. Irvine
 */
public class A082871 extends Sequence1 {

  private static final long HEURISTIC = 100;
  private long mX = 0;
  private long mY = 0;

  protected Z select(final long x, final long y) {
    return Z.valueOf(x);
  }

  @Override
  public Z next() {
    while (true) {
      if (++mY > HEURISTIC * (mX + 1)) {
        ++mX;
        mY = mX;
      }
      if (Functions.FACTORIAL.z(mY).add(Functions.FACTORIAL.z(mX)).isSquare()) {
        return select(mX, mY);
      }
    }
  }
}
