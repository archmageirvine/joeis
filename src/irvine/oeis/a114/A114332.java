package irvine.oeis.a114;
// manually 2023-11-09 BWv/24

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A114332 English spelling of n ends with a(n)-th letter of the alphabet.
 * @author Georg Fischer
 */
public class A114332 extends AbstractSequence {

  private static final int[] RESIDUES = new int[]{25, 5, 15, 5, 18, 5, 24, 14, 20, 5};
  private int mN = -1;

  /** Construct the sequence. */
  public A114332() {
    super(0);
  }

  @Override
  public Z next() {
    ++mN;
    if (mN == 0) {
      return Z.valueOf(15); // zerO
    }
    if (mN % 1000000 == 0) {
      return Z.valueOf(14); // millioN, billioN, ...
    }
    final int r = mN % 100;
    if (r == 0) {
      return Z.FOUR; // hundreD, thousanD
    }
    if (r == 12) {
      return Z.FIVE; // twelvE
    }
    if (10 <= r && r < 20) {
      return Z.valueOf(14); // teN, eleveN, thirteeN, ..., nineteeN
    }
    return Z.valueOf(RESIDUES[mN % 10]); // *Y, *onE, ..., *ninE
  }
}
