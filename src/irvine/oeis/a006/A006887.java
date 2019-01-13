package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006887.
 * @author Sean A. Irvine
 */
public class A006887 implements Sequence {

  // After Jack Brennan

  private static final int[] SMALL = {1, 8, 45};
  private int mN = 0;

  // mDelta is the difference between mI^3 and (mI+1)^3, expressed as three digits of base B.
  // Note that it's equal to 3*mI^2+3*mI+1, and that it increments each time by 6*mI+6.
  private Z mJ = Z.valueOf(100);
  private Z mBase = Z.valueOf(1000);
  private final Z[] mD = {Z.ZERO, Z.ZERO, Z.ONE};
  private final Z[] mDelta = {mJ.multiply(3).add(1), mJ.multiply(3).divide(10), Z.ZERO};
  private final Z[] mQ = {mJ.multiply(6).add(6), Z.ZERO};
  private Z mI = mJ;

  @Override
  public Z next() {
    if (mN < SMALL.length) {
      return Z.valueOf(SMALL[mN++]);
    }
    while (true) {
      while ((mI = mI.add(1)).compareTo(mBase) < 0) {
        int carry;
        mD[0] = mD[0].add(mDelta[0]);
        if (mD[0].compareTo(mBase) >= 0) {
          mD[0] = mD[0].subtract(mBase);
          carry = 1;
        } else {
          carry = 0;
        }
        mD[1] = mD[1].add(mDelta[1]).add(carry);
        if (mD[1].compareTo(mBase) >= 0) {
          mD[1] = mD[1].subtract(mBase);
          carry = 1;
        } else {
          carry = 0;
        }
        mD[2] = mD[2].add(mDelta[2]).add(carry);
        mDelta[0] = mDelta[0].add(mQ[0]);
        if (mDelta[0].compareTo(mBase) >= 0) {
          mDelta[0] = mDelta[0].subtract(mBase);
          carry = 1;
        } else {
          carry = 0;
        }
        mDelta[1] = mDelta[1].add(mQ[1]).add(carry);
        if (mDelta[1].compareTo(mBase) >= 0) {
          mDelta[1] = mDelta[1].subtract(mBase);
          carry = 1;
        } else {
          carry = 0;
        }
        mDelta[2] = mDelta[2].add(carry);
        mQ[0] = mQ[0].add(6);
        if (mQ[0].compareTo(mBase) >= 0) {
          mQ[0] = mQ[0].subtract(mBase);
          mQ[1] = mQ[1].add(1);
        }
        if (mD[2].add(mD[1]).add(mD[0]).equals(mI)) {
          return mI;
        }
      }
      mJ = mJ.multiply(10);
      mBase = mBase.multiply(10);
      mD[0] = Z.ZERO;
      mD[1] = Z.ZERO;
      mD[2] = mBase.divide(1000);
      mDelta[0] = mJ.multiply(3).add(1);
      mDelta[1] = mJ.multiply(3).divide(10);
      mDelta[2] = Z.ZERO;
      mQ[0] = mJ.multiply(6).add(6);
      mQ[1] = Z.ZERO;
    }
  }
}
