package irvine.oeis.a000;

import java.util.ArrayList;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence2;

/**
 * A000106 2nd power of rooted tree enumerator; number of linear forests of 2 rooted trees.
 * @author Sean A. Irvine
 */
public class A000106 extends Sequence2 {

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

