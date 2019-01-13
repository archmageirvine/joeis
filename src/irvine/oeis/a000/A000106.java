package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

import java.util.ArrayList;

/**
 * A000106.
 * @author Sean A. Irvine
 */
public class A000106 implements Sequence {

  private final ArrayList<Z> mA81 = new ArrayList<>();
  private final Sequence mSeq = new A000081();

  /** Construct the sequence. */
  public A000106() {
    mSeq.next();
  }

  @Override
  public Z next() {
    mA81.add(mSeq.next());
    final int size = mA81.size();
    Z r = Z.ZERO;
    for (int k = 0; k < size / 2; ++k) {
      r = r.add(mA81.get(k).multiply(mA81.get(size - k - 1)));
    }
    r = r.multiply2();
    if ((size & 1) == 1) {
      r = r.add(mA81.get(size / 2).square());
    }
    return r;
  }
}

