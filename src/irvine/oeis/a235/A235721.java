package irvine.oeis.a235;
// Generated by gen_seq4.pl dersimple at 2022-12-15 23:30

import irvine.math.z.Z;
import irvine.oeis.a054.A054034;

/**
 * A235721 Squares which have one or more occurrences of exactly six different digits.
 * @author Georg Fischer
 */
public class A235721 extends A054034 {

  @Override
  public Z next() {
    return super.next().square();
  }
}
