package irvine.oeis.a059;

import irvine.math.z.Z;
import irvine.oeis.a033.A033307;

/**
 * A059805 Natural numbers written with digits grouped in pairs and leading zeros omitted.
 * @author Sean A. Irvine
 */
public class A059805 extends A033307 {

  @Override
  public Z next() {
    return super.next().multiply(10).add(super.next());
  }
}
