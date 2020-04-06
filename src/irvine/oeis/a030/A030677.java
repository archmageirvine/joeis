package irvine.oeis.a030;

import irvine.math.z.Z;

/**
 * A030677 <code>a(n)</code> is the square root of <code>A030676(n)</code>.
 * @author Sean A. Irvine
 */
public class A030677 extends A030676 {

  @Override
  public Z next() {
    return super.next().sqrt();
  }
}

