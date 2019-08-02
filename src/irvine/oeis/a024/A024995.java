package irvine.oeis.a024;

import irvine.oeis.RecordPositionSequence;
import irvine.oeis.SkipSequence;

/**
 * A024995 Least k such that k has more periodic partitions than does any j less than k <code>(cf. A024994)</code>.
 * @author Sean A. Irvine
 */
public class A024995 extends RecordPositionSequence {

  /** Construct the sequence. */
  public A024995() {
    super(new SkipSequence(new A024994(), 3), 4);
  }
}
