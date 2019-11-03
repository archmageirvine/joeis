package irvine.oeis.a027;

import irvine.math.z.Z;

/**
 * A027417 Number of distinct products <code>ij</code> with <code>0 &lt;=</code> i, j <code>&lt;= 2^n - 1</code>.
 * @author Sean A. Irvine
 */
public class A027417 extends A027384 {

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      if ((mN & (mN + 1)) == 0) {
        return t;
      }
    }
  }
}
