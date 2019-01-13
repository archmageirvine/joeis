package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

import java.util.ArrayList;

/**
 * A000462.
 * @author Sean A. Irvine
 */
public class A000462 implements Sequence {

  private Z mN = Z.ZERO;

  private final A000217 mTriSeq = new A000217();
  private final ArrayList<Z> mTri = new ArrayList<>();

  private Z triangle(final int b) {
    while (b >= mTri.size()) {
      mTri.add(mTriSeq.next());
    }
    return mTri.get(b);
  }

  @Override
  public Z next() {
    mN = mN.add(1);
    int b = 0;
    while (triangle(++b).compareTo(mN) <= 0) {
      // do nothing
    }
    final StringBuilder sb = new StringBuilder();
    Z m = mN;
    while (--b > 0) {
      final Z[] qr = m.divideAndRemainder(triangle(b));
      sb.append(qr[0]);
      m = qr[1];
    }
    return new Z(sb.toString());
  }
}
