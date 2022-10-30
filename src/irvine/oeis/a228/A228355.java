package irvine.oeis.a228;
// manually 2021-07-24

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.a000.A000040;

/**
 * A228355 Write the primes backwards in base 10 and juxtapose their digits.
 * @author Georg Fischer
 */
public class A228355 extends A000040 {

  protected String mS;
  protected int mPos;

  /** Construct the sequence. */
  public A228355() {
    setOffset(0);
    mS = "";
    mPos = 0;
  }

  @Override
  public Z next() {
    if (++mPos >= mS.length()) {
      mS = ZUtils.reverse(super.next()).toString(10);
      mPos = 0;
    }
    final char c = mS.charAt(mPos);
    return Z.valueOf(c - (c <= '9' ? '0' : 'a'));
  }
}
