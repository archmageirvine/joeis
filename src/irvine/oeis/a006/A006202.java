package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.a224.A224068;

/**
 * A006202 Number of colorings of labeled graphs on n nodes using exactly 4 colors, divided by 4!*2^6.
 * @author Sean A. Irvine
 */
public class A006202 extends A224068 {

  @Override
  public Z next() {
    return super.next().divide(1536);
  }
}
