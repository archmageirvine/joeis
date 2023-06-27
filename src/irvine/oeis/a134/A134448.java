package irvine.oeis.a134;

import irvine.math.z.Z;
import irvine.oeis.recur.LinearRecurrence;

/**
 * A134448 a(n) = discriminant of Brioschi quintic polynomial x^5 - 10*n*x^3 + 45*n^2*x - n^2.
 * @author Sean A. Irvine
 */
public class A134448 extends LinearRecurrence {

  /** Construct the sequence. */
  public A134448() {
    super(1, new long[] {1, -11, 55, -165, 330, -462, 462, -330, 165, -55, 11},
      new Z[] {Z.valueOf(9320403125L), Z.valueOf(9549620000000L), Z.valueOf(550785472903125L), Z.valueOf(9781641420800000L), Z.valueOf(91103907470703125L), Z.valueOf(564113147623200000L), Z.valueOf(2635397242528203125L), new Z("10017850209075200000"), new Z("32531698595851003125"), new Z("93301200312500000000"), new Z("242001831271659903125")});
  }
}
