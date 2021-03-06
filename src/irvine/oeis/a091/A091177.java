package irvine.oeis.a091;
// Generated by gen_seq4.pl nthprimf 2020-06-14 20:25
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A091177 Numbers m such that the m-th prime is of the form 3*k-1.
 * @author Georg Fischer
 */
public class A091177 extends A000040 {
  protected long mK = 0;
  protected Z mNP = null;
  protected boolean isOk() {
    return mNP.mod(Z.THREE).equals(Z.TWO);
  }
  
  @Override
  public Z next() {
    ++mK;
    mNP = super.next();
    while (! isOk()) {
      ++mK;
      mNP = super.next();
    }  
    return Z.valueOf(mK);
  }

}
