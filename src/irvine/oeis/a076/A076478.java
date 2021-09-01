package irvine.oeis.a076;

import irvine.math.z.Z;
import irvine.oeis.a033.A033308;

/**
 * A076478 The binary Champernowne sequence: concatenate binary vectors of lengths 1, 2, 3, ... in numerical order.
 * @author Sean A. Irvine
 */
public class A076478 extends A033308 {

  protected int mN;
  
  /** Construct the sequence. */
  public A076478() {
    mBase = 2;
    mN = 1;
    mS = "";
    mPos = 0;
  }

  @Override
  public Z next() {
    if (++mPos >= mS.length()) {
      ++mN;
      mS = Integer.toBinaryString(mN).substring(1);
      mPos = 0;
    }
    final char c = mS.charAt(mPos);
    return Z.valueOf(c - (c <= '9' ? '0' : 'a'));
  }
}
