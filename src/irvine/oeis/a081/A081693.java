package irvine.oeis.a081;

import irvine.math.z.Z;

/**
 * A081693 Define two sequences by A_n = mex{A_i,B_i : 0 &lt;= i &lt; n}, B_n = B_{n-1} + (A_n-A_{n-1})(A_n-A_{n-1}+1), where the mex of a set is the smallest nonnegative integer not in the set. Sequence gives B_n. A_n is in A081692.
 * @author Sean A. Irvine
 */
public class A081693 extends A081692 {

  @Override
  public Z next() {
    super.next();
    return mB.last();
  }
}
