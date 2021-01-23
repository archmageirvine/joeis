package irvine.oeis.a015;

import irvine.math.z.Z;

/**
 * A015945 Positive integers n such that n | (2^n + n/2 + 1).
 * @author Sean A. Irvine
 */
public class A015945 extends A015950 {

  @Override
  public Z next() {
    return super.next().multiply2();
  }
}
