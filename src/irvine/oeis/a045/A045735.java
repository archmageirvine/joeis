package irvine.oeis.a045;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A045735 Concatenation of 2 or more prime numbers is prime (each term starts where previous term left off).
 * @author Sean A. Irvine
 */
public class A045735 extends A000040 {

  @Override
  public Z next() {
    final StringBuilder sb = new StringBuilder(super.next().toString());
    Z p;
    do {
      sb.append(super.next());
      p = new Z(sb);
    } while (!p.isProbablePrime());
    return p;
  }
}
