package irvine.oeis.a036;

import irvine.math.z.Z;

/**
 * A036582 Ternary Thue-Morse sequence: closed under a-&gt;abc, b-&gt;ac, c-&gt;b.
 * @author Sean A. Irvine
 */
public class A036582 extends A036579 {

  @Override
  public Z next() {
    return super.next().add(1);
  }
}
