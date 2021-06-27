package irvine.oeis.a048;

import irvine.math.z.Z;
import irvine.oeis.a003.A003714;

/**
 * A048679 Compressed fibbinary numbers (A003714), with rewrite 0-&gt;0, 01-&gt;1 applied to their binary expansion.
 * @author Sean A. Irvine
 */
public class A048679 extends A003714 {

  @Override
  public Z next() {
    return new Z(super.next().toString(2).replace("01", "1"), 2);
  }
}

