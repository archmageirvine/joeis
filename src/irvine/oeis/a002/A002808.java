package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002808 The composite numbers: numbers n of the form x*y for x &gt; 1 and y &gt; 1.
 * @author Sean A. Irvine
 */
public class A002808 implements Sequence {

  protected Z mN = Z.THREE;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (!mN.isPrime()) {
        return mN;
      }
    }
  }
}

