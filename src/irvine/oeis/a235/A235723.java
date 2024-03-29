package irvine.oeis.a235;
// Generated by gen_seq4.pl dersimple at 2022-12-15 23:30

import irvine.math.z.Z;
import irvine.oeis.a054.A054036;

/**
 * A235723 Squares which have one or more occurrences of exactly eight different digits.
 * @author Georg Fischer
 */
public class A235723 extends A054036 {

  @Override
  public Z next() {
    return super.next().square();
  }
}
