package irvine.oeis.a033;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A033307 Decimal expansion of Champernowne constant (or Mahler's number), formed by concatenating the positive integers.
 * @author Sean A. Irvine
 */
public class A033307 implements Sequence {

  private long mN = 0;
  private String mS = "";
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM >= mS.length()) {
      mS = Long.toString(++mN);
      mM = 0;
    }
    return Z.valueOf(mS.charAt(mM) - '0');
  }
}
