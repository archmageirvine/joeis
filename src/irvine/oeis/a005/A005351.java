package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A005351 Base -2 representation for n regarded as base 2, then evaluated.
 * @author Sean A. Irvine
 */
public class A005351 extends Sequence0 {

  private long mN = -1;

  /**
   * Compute the representation of a number in a negative base.
   * @param value number
   * @param base base
   * @return representation
   */
  public static String negativeRepresentation(long value, final int base) {
    assert base < 0;
    final StringBuilder sb = new StringBuilder();
    while (value != 0) {
      long  remainder = value % base;
      value = value / base;
      if (remainder < 0) {
        remainder -= base;
        ++value;
      }
      sb.insert(0, remainder);
    }
    return sb.length() == 0 ? "0" : sb.toString();
  }


  @Override
  public Z next() {
    return new Z(negativeRepresentation(++mN, -2), 2);
  }
}
