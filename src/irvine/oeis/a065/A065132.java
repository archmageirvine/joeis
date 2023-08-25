package irvine.oeis.a065;

import irvine.math.z.Z;
import irvine.oeis.a024.A024934;

/**
 * A065132 Arithmetic mean of first n terms of A008472 is an integer.
 * @author Sean A. Irvine
 */
public class A065132 extends A024934 {

  private final A024934 mSeq = new A024934();
  private long mN = 1;

  /** Construct the sequence. */
  public A065132() {
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

