package irvine.oeis.a019;

import irvine.math.z.Z;
import irvine.oeis.a002.A002251;

/**
 * A019444.
 * @author Sean A. Irvine
 */
public class A019444 extends A002251 {

  @Override
  public Z next() {
    return super.next().add(1);
  }
}
