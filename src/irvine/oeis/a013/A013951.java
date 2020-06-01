package irvine.oeis.a013;

import irvine.math.z.Z;

/**
 * A013951 Start with 1, apply <code>1-&gt;12, 21-&gt;21, 22-&gt;21, 2-&gt;2</code> (for final <code>2);</code> take limit; note positions of <code>1</code>'s.
 * @author Sean A. Irvine
 */
public class A013951 extends A013949 {

  @Override
  public Z next() {
    while (true) {
      if (Z.ONE.equals(super.next())) {
        return Z.valueOf(mN + 1);
      }
    }
  }
}
