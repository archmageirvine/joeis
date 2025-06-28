package irvine.oeis.a078;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a002.A002033;
import irvine.oeis.a051.A051953;

/**
 * A078347 Numbers k such that the number of ordered factorizations of k is &gt; cototient(k).
 * @author Sean A. Irvine
 */
public class A078347 extends Sequence1 {

  private final Sequence mA = new A002033();
  private final Sequence mB = new A051953();
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final Z a = mA.next();
      final Z b = mB.next();
      if (a.compareTo(b) > 0) {
        return Z.valueOf(mN);
      }
    }
  }
}

