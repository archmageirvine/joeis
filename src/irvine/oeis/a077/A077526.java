package irvine.oeis.a077;

import irvine.math.z.Z;
import irvine.oeis.FilterSequence;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a002.A002113;

/**
 * A077526 Triangle in which the n-th row contains n palindromes beginning with n.
 * @author Sean A. Irvine
 */
public class A077526 extends Sequence1 {

  private int mN = 0;
  private int mM = 0;
  private String mS = null;
  private Sequence mGen = null;

  @Override
  public Z next() {
    if (++mM >= mN) {
      mS = String.valueOf(++mN);
      mM = 0;
      // Not particular efficient, but otherwise need to handle tricky cases like:
      //  101 is a palindrome starting with 10
      //  1221 is a palindrome starting with 122, etc.
      mGen = new FilterSequence(new A002113(), k -> k.toString().startsWith(mS));
    }
    return mGen.next();
  }
}
