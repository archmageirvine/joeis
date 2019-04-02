package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042931 Denominators of continued fraction convergents to sqrt(997).
 * @author Sean A. Irvine
 */
public class A042931 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042931() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 169812, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 1, 2, 5, 7, 33, 40, 73, 332, 405, 1142, 1547, 2689, 168265, 170954, 339219, 849392, 1188611, 5603836, 6792447, 12396283, 56377579, 68773862, 193925303, 262699165, 456624468});
  }
}
