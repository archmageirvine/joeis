package irvine.oeis.a030;

import irvine.math.z.Z;

/**
 * A030309 Position of n-th 0 in A030308.
 * @author Sean A. Irvine
 */
public class A030309 extends A030308 {

  /** Construct the sequence. */
  public A030309() {
    super(1);
  }

  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (super.next().isZero()) {
        return Z.valueOf(mN);
      }
    }
  }
}

