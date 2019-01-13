package irvine.oeis.a054;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A054977.
 * @author Sean A. Irvine
 */
public class A054977 implements Sequence {

  private boolean mFirst = true;

  @Override
  public Z next() {
    if (mFirst) {
      mFirst = false;
      return Z.TWO;
    }
    return Z.ONE;
  }
}

