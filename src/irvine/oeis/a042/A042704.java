package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042704 Numerators of continued fraction convergents to <code>sqrt(882)</code>.
 * @author Sean A. Irvine
 */
public class A042704 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042704() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 39202, 0, 0, 0, 0, 0, 0, 0}, new long[] {29, 30, 89, 297, 1871, 5910, 13691, 19601, 1150549, 1170150, 3490849, 11642697, 73347031, 231683790, 536714611, 768398401});
  }
}
