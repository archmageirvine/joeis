package irvine.oeis.a393;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A393547 a(n) is the length of the finite sequence of positive integers (x_1, x_2, ...), where x_1 = n and, for i &gt;= 1, x_{i+1} = min { k &gt; 0 | x_i + k^2 is a perfect square } if such a k exists; otherwise x_i is the last term of the sequence.
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
