package irvine.oeis.a030;

import irvine.math.z.Z;

/**
 * A030677 a(n) is the square root of A030676(n).
 * @author Sean A. Irvine
 */
public class A030677 extends A030676 {

  @Override
  public Z next() {
    return super.next().sqrt();
  }
}

