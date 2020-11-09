package irvine.oeis.a036;

import irvine.math.z.Z;
import irvine.oeis.a029.A029883;

/**
 * A036577 Ternary Thue-Morse sequence: closed under a-&gt;abc, b-&gt;ac, c-&gt;b.
 * @author Sean A. Irvine
 */
public class A036577 extends A029883 {

  @Override
  public Z next() {
    return super.next().add(1);
  }
}
