package irvine.oeis.a318;

import irvine.math.z.Z;
import irvine.oeis.a205.A205007;

/**
 * A318894 Positions of terms &gt; 1 in A205007, or equally, where A205006(n) != n.
 * @author Georg Fischer
 */
public class A318894 extends A205007 {

  private int mK = 0;

  @Override
  public Z next() {
    while (true) {
      ++mK;
      if (super.next().compareTo(Z.ONE) > 0) {
        return Z.valueOf(mK);
      }
    }
  }
}
