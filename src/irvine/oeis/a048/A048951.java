package irvine.oeis.a048;

import irvine.math.z.Z;
import irvine.oeis.a002.A002858;

/**
 * A048951 (2,4) Ulam sequence.
 * @author Sean A. Irvine
 */
public class A048951 extends A002858 {

  @Override
  public Z next() {
    return super.next().multiply2();
  }
}

