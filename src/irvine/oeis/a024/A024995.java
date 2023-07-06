package irvine.oeis.a024;

import irvine.oeis.RecordPositionSequence;

/**
 * A024995 Least k such that k has more periodic partitions than does any j less than k (cf. A024994).
 * @author Sean A. Irvine
 */
public class A024995 extends RecordPositionSequence {

  /** Construct the sequence. */
  public A024995() {
    super(2, new A024994().skip(3), 4);
  }
}
