package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007300 <code>a(1)=2, a(2)=5</code>; for <code>n &gt;= 3, a(n)</code> is smallest number which is uniquely of the form <code>a(j) + a(k)</code> with <code>1 &lt;= j &lt; k &lt; n</code>.
 * @author Sean A. Irvine
 */
public class A007300 implements Sequence {

  private static final int[] INITIAL = {2, 5, 7, 9, 11, 12};
  private static final int[] ADD = {13, 15, 19, 23, 27, 29, 35, 37, 41, 43, 45, 49, 51, 55, 61, 67, 69, 71, 79, 83, 85, 87, 89, 95, 99, 107, 109, 119, 131, 133, 135, 137};
  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    return mN < INITIAL.length
      ? Z.valueOf(INITIAL[(int) mN])
      : Z.valueOf((mN - 6) / ADD.length).multiply(126).add(ADD[(int) ((mN - 6) % ADD.length)]);
  }
}
