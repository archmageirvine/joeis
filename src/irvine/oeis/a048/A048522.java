package irvine.oeis.a048;

import irvine.math.z.Z;
import irvine.oeis.a045.A045998;

/**
 * A048522 Terms of Binary Gleichniszahlen-Reihe (BGR) sequence A045998 converted into decimal (Look and Say Sequence, mod 2, read in binary and converted to decimal).
 * @author Sean A. Irvine
 */
public class A048522 extends A045998 {

  @Override
  public Z next() {
    return new Z(super.next().toString(), 2);
  }
}
