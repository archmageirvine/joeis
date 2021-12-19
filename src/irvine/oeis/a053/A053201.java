package irvine.oeis.a053;

import irvine.math.z.Z;
import irvine.oeis.a014.A014410;

/**
 * A053201 Pascal's triangle (excluding first, last element of each row) read by rows, row n read mod n.
 * @author Sean A. Irvine
 */
public class A053201 extends A014410 {

  @Override
  public Z next() {
    return super.next().mod(Z.valueOf(mN));
  }
}
