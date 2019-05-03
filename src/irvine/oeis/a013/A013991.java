package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013991 Number of edge-disjoint paths between opposite corners of a <code>2 X n</code> grid.
 * @author Sean A. Irvine
 */
public class A013991 implements Sequence {

  // Works out potential extensions of existing terms, here
  // mA0, mA1, mA2 count arrangements with a single path
  // ending at y=0, 1, 2; respectively. mB0, mB1, mB2 have
  // a path ending at the corresponding y, but also an
  // additional pairing between the other two points.

  private Z mA0 = null;
  private Z mA1 = Z.ZERO;
  private Z mA2 = Z.ZERO;
  private Z mB0 = Z.ZERO;
  private Z mB1 = Z.ZERO;
  private Z mB2 = Z.ZERO;

  @Override
  public Z next() {
    if (mA0 == null) {
      mA0 = Z.ONE;
      return Z.ONE;
    }
    final Z t = mA0.add(mA1).add(mA2);
    final Z a0 = t.add(mB2).add(mB1);
    final Z a1 = t.add(mB0.add(mB1).add(mB2).multiply2());
    final Z a2 = t.add(mB0).add(mB1);
    final Z b0 = mA0.add(mA1).add(mB0);
    final Z b1 = mA1.add(mB1);
    final Z b2 = mA2.add(mA1).add(mB2);
    mA0 = a0;
    mA1 = a1;
    mA2 = a2;
    mB0 = b0;
    mB1 = b1;
    mB2 = b2;
    return mA2;
  }
}

