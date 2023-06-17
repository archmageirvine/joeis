package irvine.oeis.a039;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A039956 Even squarefree numbers.
 * @author Sean A. Irvine
 */
public class A039956 extends AbstractSequence {

  /** Construct the sequence. */
  public A039956() {
    super(1);
  }

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      mN += 2;
      if (LongUtils.isSquareFree(mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}

