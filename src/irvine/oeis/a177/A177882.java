package irvine.oeis.a177;
// manually (bisect) 2021-07-05

import irvine.math.z.Z;
import irvine.oeis.a001.A001317;

/**
 * A177882 Trisection of A001317.
 * @author Georg Fischer
 */
public class A177882 extends A001317 {
  
  @Override
  public Z next() {
    final Z result = super.next();
    super.next();
    super.next();
    return result;
  }
}
