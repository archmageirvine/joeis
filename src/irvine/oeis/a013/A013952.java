package irvine.oeis.a013;

import irvine.math.z.Z;

/**
 * A013952 Start with <code>1,</code> apply <code>1-&gt;12, 21-&gt;21, 22-&gt;21, 2-&gt;2</code> (for final <code>2)</code>; take limit; note positions of 2's.
 * @author Sean A. Irvine
 */
public class A013952 extends A013949 {

  @Override
  public Z next() {
    while (true) {
      if (Z.TWO.equals(super.next())) {
        return Z.valueOf(mN + 1);
      }
    }
  }
}
