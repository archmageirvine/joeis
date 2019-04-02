package irvine.oeis.a177;

import irvine.math.z.Z;
import irvine.oeis.a090.A090466;

import java.util.ArrayList;

/**
 * A177202 Nontrivially polygonal-free numbers.
 * @author Sean A. Irvine
 */
public class A177202 extends A090466 {

  private final ArrayList<Z> mSeq = new ArrayList<>();
  {
    mSeq.add(super.next());
  }
  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (mN.compareTo(mSeq.get(mSeq.size() - 1)) > 0) {
        mSeq.add(super.next());
      }
      boolean ok = true;
      for (final Z d : mSeq) {
        if (mN.mod(d).equals(Z.ZERO)) {
          ok = false;
          break;
        }
      }
      if (ok) {
        return mN;
      }
    }
  }
}
