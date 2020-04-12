package irvine.oeis.a031;

import irvine.math.z.Z;

/**
 * A031143 Position of rightmost <code>0</code> (including leading <code>0)</code> in <code>2^A031142(n)</code>.
 * @author Sean A. Irvine
 */
public class A031143 extends A031142 {

  @Override
  public Z next() {
    super.next();
    return Z.valueOf(mPrevBest);
  }
}

