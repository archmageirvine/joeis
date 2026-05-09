package irvine.oeis.a084;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a002.A002808;

/**
 * A084759 Composite numbers in ascending order such that the difference of successive terms is unique. a(m) - a(m-1) = a(k) - a(k-1) iff m = k.
 * @author Sean A. Irvine
 */
public class A084759 extends Sequence1 {

  private final Sequence mS;
  private final HashSet<Z> mSeen = new HashSet<>();
  private Z mA = null;

  protected A084759(final Sequence s) {
    mS = s;
  }

  /** Construct the sequence. */
  public A084759() {
    this(new A002808());
  }

  @Override
  public Z next() {
    if (mA == null) {
      mA = mS.next();
      return mA;
    }
    final Z c = mA;
    while (true) {
      mA = mS.next();
      if (mSeen.add(mA.subtract(c))) {
        return mA;
      }
    }
  }
}
