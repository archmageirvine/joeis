package irvine.oeis.a235;
// Generated by gen_seq4.pl dersimple at 2022-12-15 23:30

import irvine.math.z.Z;
import irvine.oeis.a054.A054035;

/**
 * A235722 Squares which have one or more occurrences of exactly seven different digits.
 * @author Georg Fischer
 */
public class A235722 extends A054035 {

  @Override
  public Z next() {
    return super.next().square();
  }
}
