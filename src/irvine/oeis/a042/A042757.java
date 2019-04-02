package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042757 Denominators of continued fraction convergents to sqrt(909).
 * @author Sean A. Irvine
 */
public class A042757 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042757() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 161602, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 6, 7, 20, 127, 274, 401, 2680, 161201, 969886, 1131087, 3232060, 20523447, 44278954, 64802401, 433093360});
  }
}
