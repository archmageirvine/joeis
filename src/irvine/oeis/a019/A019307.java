package irvine.oeis.a019;

import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a014.A014588;

/**
 * A019307 First time that the Grundy function G(x) for "subtract-a-Fibonacci-number" takes the value n.
 * @author Sean A. Irvine
 */
public class A019307 extends Sequence0 {

  private MemorySequence mA = new A014588();
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    int k = 0;
    while (true) {
      if (k >= mA.size()) {
        mA.next();
      }
      if (mA.a(k).intValue() == mN) {
        return Z.valueOf(k);
      }
      ++k;
    }
  }
}
