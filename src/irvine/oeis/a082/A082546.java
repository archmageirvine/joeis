package irvine.oeis.a082;

import java.util.HashSet;

import irvine.math.z.Z;

/**
 * A082546 Numbers n such that n=A082534(x)=A082534(y), where x&lt;y.
 * @author Sean A. Irvine
 */
public class A082546 extends A082534 {

  private final HashSet<Z> mSeen = new HashSet<>();
  private final HashSet<Z> mReported = new HashSet<>();

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      if (!mSeen.add(t) && mReported.add(t)) {
        return t;
      }
    }
  }
}
