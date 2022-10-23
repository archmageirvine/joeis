package irvine.oeis.a041;
// manually 2021-03-04

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence0;

/**
 * A041013 Reverse or double: if reverse of a(n) &gt; a(n), then a(n+1) = a(n) reversed, otherwise a(n+1) = 2*a(n).
 * @author Georg Fischer
 */
public class A041013 extends Sequence0 {

  protected Z mTerm; // a(n)
  
  /** Construct the sequence. */
  public A041013() {
    mTerm = Z.ONE;
  }

  @Override
  public Z next() {
    final Z result = mTerm;
    final Z rev = ZUtils.reverse(mTerm, 10);
    mTerm = rev.compareTo(mTerm) > 0 ? rev : mTerm.multiply2();
    return result;
  }
}
