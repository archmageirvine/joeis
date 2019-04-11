package irvine.oeis.a049;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A049872 Integers in base 12, written using 2 decimal digits <code>(00, 01, 02, ...,09, 10, 11)</code> to represent base-12 "digits".
 * Integers in base 12 with each base 12 digit represented by 2 decimal digits.
 * @author Georg Fischer
 */
public class A049872 implements Sequence  {

  private long mN = -1;

  @Override
  public Z next() {
    return new Z(Z.valueOf(++mN).toTwoDigits(12));
  }
}
