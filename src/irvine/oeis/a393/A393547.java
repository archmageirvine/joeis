package irvine.oeis.a393;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A393547 allocated for Naoki Azuma.
 * @author Sean A. Irvine
 */
public class A393547 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long cnt = 1;
    Z x = Z.valueOf(mN);
    while (!x.isOne() && !x.equals(Z.FOUR) && x.mod(4) != 2) {
      long k = 0;
      while (!x.add(++k * k).isSquare()) {
        // do nothing
      }
      x = Z.valueOf(k);
      ++cnt;
    }
    return Z.valueOf(cnt);
  }
}
