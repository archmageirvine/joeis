package irvine.oeis.a057;

import irvine.math.z.Z;

/**
 * A057154 Construct difference array so that (1) first row begins with 1, (2) every row is monotonic increasing, (3) no number appears more than once, (4) smallest number not yet used begins a new row. Sequence gives numbers not used.
 * @author Sean A. Irvine
 */
public class A057154 extends A057153 {

  private Z mM = Z.FOUR;
  {
    super.next();
  }

  @Override
  public Z next() {
    while (true) {
      mM = mM.add(1);
      while (mA.get(mA.size() - 1).compareTo(mM) < 0) {
        super.next();
      }
      if (!mUsed.contains(mM)) {
        return mM;
      }
    }
  }
}

