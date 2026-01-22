package irvine.oeis.a392;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A392510 Decimal expansion of the total number of possible books in the fictional library described in the short story "The Library of Babel" by J. L. Borges (1941).
 * @author Sean A. Irvine
 */
public class A392510 extends AbstractSequence {

  private final String mS = Z.valueOf(25).pow(1312000).toString();
  private int mN = 0;

  /** Construct the sequence. */
  public A392510() {
    super(1834098);
  }

  @Override
  public Z next() {
    if (mN >= mS.length()) {
      return null;
    }
    return Z.valueOf(mS.charAt(mN++) - '0');
  }
}
