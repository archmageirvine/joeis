package irvine.oeis.a055;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A055643 Babylonian numbers: integers in base 60 with each sexagesimal digit represented by 2 decimal digits, leading zeros omitted. 
 * Integers in base 60 with each base 60 digit represented by 2 decimal digits.
 * @author Georg Fischer
 */
public class A055643 implements Sequence  {

  private long mN = -1;

  @Override
  public Z next() {
    return new Z(Z.valueOf(++mN).toTwoDigits(60));
  }
}
