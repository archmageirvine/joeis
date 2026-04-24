package irvine.oeis.a393;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.a114.A114433;
import irvine.oeis.a237.A237042;

/**
 * A393653 allocated for Alonso del Arte.
 * @author Sean A. Irvine
 */
public class A393653 extends A114433 {

  private final DirectSequence mUPC = new A237042();

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final Z t = super.next();
      if (t.equals(mUPC.a(978000000000L + mN))) {
        return Z.valueOf(mN * 10 + t.longValue());
      }
    }
  }
}

