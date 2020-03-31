package irvine.oeis.a030;

import irvine.math.z.Z;

/**
 * A030289 <code>a(n+1)</code> is the next larger cube with no digits in common with <code>a(n), a(0) = 0</code>.
 * @author Sean A. Irvine
 */
public class A030289 extends A030290 {

  @Override
  public Z next() {
    return super.next().pow(3);
  }
}
