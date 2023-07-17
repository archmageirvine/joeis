package irvine.oeis.a030;

import irvine.math.z.Z;

/**
 * A030346 Length of n-th run of digit 0 in A030341.
 * @author Sean A. Irvine
 */
public class A030346 extends A030341 {

  /** Construct the sequence. */
  public A030346() {
    super(1);
  }

  private boolean mFirst = true;

  @Override
  public Z next() {
    long cnt = 1;
    if (mFirst) {
      mFirst = false;
      --cnt;
    } else {
      while (!super.next().isZero()) {
        // do nothing
      }
    }
    while (super.next().isZero()) {
      ++cnt;
    }
    return Z.valueOf(cnt);
  }
}

