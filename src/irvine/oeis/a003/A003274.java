package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.a069.A069241;

/**
 * A003274 Number of key permutations of length n: permutations {a_i} with |a_i-a_{i-1}| <code>= 1</code> or 2.
 * @author Sean A. Irvine
 */
public class A003274 extends A069241 {

  private int mN = 0;

  @Override
  public Z next() {
    if (mN < 2) {
      ++mN;
      super.next();
      return Z.ONE;
    }
    return super.next().multiply2();
  }

}
