package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.a000.A000010;

/**
 * A002246 <code>a(1) = 3</code>; for <code>n &gt; 1, a(n) =</code> 4*phi(n); given a rational number r = p/q, where q&gt;0, (p,q)=1, define its height to be max{|p|,q}; then <code>a(n) =</code> number of rational numbers of height n.
 * @author Sean A. Irvine
 */
public class A002246 extends A000010 {

  private boolean mFirst = true;

  @Override
  public Z next() {
    if (mFirst) {
      super.next();
      mFirst = false;
      return Z.THREE;
    }
    return super.next().shiftLeft(2);
  }
}
