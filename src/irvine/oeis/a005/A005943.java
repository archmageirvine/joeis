package irvine.oeis.a005;

import java.util.ArrayList;
import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.a020.A020985;

/**
 * A005943 Number of subwords of length n in the <code>Golay-Rudin-Shapiro</code> binary word <code>A020987</code>.
 * @author Sean A. Irvine
 */
public class A005943 extends A020985 {

  // There is a conjectured g.f. for this sequence, but here we compute more directly
  // but there is still a chance we could go wrong.  However, if we put out a wrong
  // value this will eventually be detected and reported.

  // This could be made to do more terms by using something other than Long for
  // retaining most recent terms and the seen array.

  private int mN = -1;
  private long mV = 0;
  private final ArrayList<HashSet<Long>> mSeen = new ArrayList<>();
  {
    for (int k = 0; k < 64; ++k) {
      mSeen.add(new HashSet<>());
    }
    mSeen.get(0).add(0L);
    // Initial run up (to fill mV);
    for (long u = 0; u < 64; ++u) {
      mV <<= 1;
      if (super.next().signum() > 0) {
        mV |= 1;
      }
      long m = 1;
      for (int k = 1; k < u; ++k, m <<= 1, m |= 1) {
        mSeen.get(k).add(mV & m);
      }
    }
  }

  @Override
  public Z next() {
    if (++mN == 64) {
      throw new UnsupportedOperationException();
    }
    // Add some more steps of the underlying sequence
    for (long u = 0; u < 10000; ++u) {
      mV <<= 1;
      if (super.next().signum() > 0) {
        mV |= 1;
      }
      long m = 1;
      for (int k = 1; k < mSeen.size(); ++k, m <<= 1, m |= 1) {
        if (mSeen.get(k).add(mV & m) && k < mN) {
          throw new UnsupportedOperationException("Detected error in reported value for a(" + k + ")");
        }
      }
    }
    return Z.valueOf(mSeen.get(mN).size());
  }
}
