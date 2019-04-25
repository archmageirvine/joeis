package irvine.oeis.a234;

import irvine.oeis.LinearRecurrence;

/**
 * A234253 <code>a(n) = sum_{i=1..n} C(7+i,8)^2</code>.
 * @author Sean A. Irvine
 */
public class A234253 extends LinearRecurrence {

  /** Construct the sequence. */
  public A234253() {
    super(new long[] {-1, 18, -153, 816, -3060, 8568, -18564, 31824, -43758, 48620, -43758, 31824, -18564, 8568, -3060, 816, -153, 18}, new long[] {1, 82, 2107, 29332, 274357, 1930726, 10948735, 52357960, 217994860, 808970960, 2723733524L, 8436372248L, 24304813148L, 65712993248L, 167965846148L, 408373664744L, 949291256585L, 2119095737210L});
  }
}
