package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042224 Numerators of continued fraction convergents to sqrt(638).
 * @author Sean A. Irvine
 */
public class A042224 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042224() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 84566, 0, 0, 0, 0, 0, 0, 0}, new long[] {25, 76, 101, 682, 1465, 9472, 10937, 42283, 2125087, 6417544, 8542631, 57673330, 123889291, 801009076, 924898367, 3575704177L});
  }
}
