package irvine.oeis.a022;

import irvine.math.z.Z;

/**
 * A022910 The sequence <code>M(n)</code> in <code>A022906</code>.
 * @author Sean A. Irvine
 */
public class A022910 extends A022906 {

  @Override
  public Z next() {
    super.next();
    return mMax;
  }
}
