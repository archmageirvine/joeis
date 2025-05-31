package irvine.oeis.a383;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a033.A033307;

/**
 * A383790 Prime numbers in order of occurrence as substrings in the concatenation of natural numbers 123456789101112....
 * @author Sean A. Irvine
 */
public class A383790 extends Sequence1 {

  private final Sequence mChamperknowne = new A033307();
  private final StringBuilder mS = new StringBuilder();
  private final HashSet<Z> mSeen = new HashSet<>();
  private int mM = 0;

  @Override
  public Z next() {
    while (true) {
      if (++mM >= mS.length()) {
        mS.append(mChamperknowne.next());
        mM = 0;
      }
      final Z t = new Z(mS.substring(mM, mS.length()));
      if (t.isProbablePrime() && mSeen.add(t)) {
        return t;
      }
    }
  }
}
