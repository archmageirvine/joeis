package irvine.oeis.a017;

import irvine.math.z.Z;
import irvine.oeis.LinearRecurrence;

/**
 * A017434 (11n+3)^10.
 * @author Sean A. Irvine
 */
public class A017434 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017434() {
    super(new long[] {1, -11, 55, -165, 330, -462, 462, -330, 165, -55, 11},
      new Z[] {Z.valueOf(59049), Z.valueOf(289254654976L), Z.valueOf(95367431640625L), Z.valueOf(3656158440062976L), Z.valueOf(52599132235830049L), Z.valueOf(430804206899405824L), Z.valueOf(2446194060654759801L), new Z("10737418240000000000"), new Z("38941611811810745401"), new Z("121899441999475713024"), new Z("339456738992222314849")});
  }
}
