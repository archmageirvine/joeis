package irvine.oeis.a065;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.a025.A025281;

/**
 * A065131 Arithmetic mean of first n terms of A001414 is an integer.
 * @author Sean A. Irvine
 */
public class A065131 extends Sequence1 {

  private final A025281 mSeq = new A025281();
  private long mN = 1;

  /** Construct the sequence. */
  public A065131() {
    mSeq.next();
    mSeq.next();
  }

  @Override
  public Z next() {
    while (true) {
      if (mSeq.next().mod(++mN) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}

