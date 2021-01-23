package irvine.oeis.a037;

import irvine.math.z.Z;

/**
 * A037098 Sequence A037093 shown in octal.
 * @author Sean A. Irvine
 */
public class A037098 extends A037093 {

  @Override
  public Z next() {
    return new Z(super.next().toString(8));
  }
}
