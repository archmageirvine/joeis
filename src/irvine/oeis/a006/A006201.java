package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.a213.A213442;

/**
 * A006201 Number of colorings of labeled graphs on n nodes using exactly 3 colors, divided by 48.
 * @author Sean A. Irvine
 */
public class A006201 extends A213442 {

  @Override
  public Z next() {
    return super.next().divide(48);
  }
}
