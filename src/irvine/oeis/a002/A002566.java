package irvine.oeis.a002;

/**
 * A002566.
 * @author Sean A. Irvine
 */
public class A002566 extends A002564 {

  @Override
  protected void initConstants() {
    super.initConstants();
    // In this sequence each queen must be attacked by another queen.
    // This can be achieved by zeroing the cover for the square
    // containing the queen in the normal covers (that is, the cover
    // for the square containing the queen must come from elsewhere).
    for (int k = 0; k < mCovers.length; ++k) {
      mCovers[k] = mCovers[k].xor(mPositions[k]);
    }
  }

}
