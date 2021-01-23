package irvine.oeis.a037;

import irvine.math.z.Z;

/**
 * A037099 Sequence A037094 shown in octal.
 * @author Sean A. Irvine
 */
public class A037099 extends A037094 {
  
  @Override
  public Z next() {
    return new Z(super.next().toString(8));
  }
}
