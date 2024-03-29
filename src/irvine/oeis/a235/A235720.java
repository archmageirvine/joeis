package irvine.oeis.a235;
// Generated by gen_seq4.pl dersimple at 2022-12-15 23:30

import irvine.math.z.Z;
import irvine.oeis.a054.A054033;

/**
 * A235720 Squares which have one or more occurrences of exactly five different digits.
 * @author Georg Fischer
 */
public class A235720 extends A054033 {

  @Override
  public Z next() {
    return super.next().square();
  }
}
