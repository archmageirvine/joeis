package irvine.oeis.a017;

import irvine.math.z.Z;
import irvine.oeis.LinearRecurrence;

/**
 * A017302 a(n) = (10*n + 2)^10.
 * @author Sean A. Irvine
 */
public class A017302 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017302() {
    super(new long[] {1, -11, 55, -165, 330, -462, 462, -330, 165, -55, 11},
      new Z[] {Z.valueOf(1024), Z.valueOf(61917364224L), Z.valueOf(26559922791424L), Z.valueOf(1125899906842624L), Z.valueOf(17080198121677824L), Z.valueOf(144555105949057024L), Z.valueOf(839299365868340224L), Z.valueOf(3743906242624487424L), new Z("13744803133596058624"), new Z("43438845422363213824"), new Z("121899441999475713024")});
  }
}
