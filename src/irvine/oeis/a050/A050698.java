package irvine.oeis.a050;

import irvine.oeis.SetDifferenceSequence;
import irvine.oeis.a035.A035139;

/**
 * A050698 Numbers that appear in A050695 but not in A035139.
 * @author Sean A. Irvine
 */
public class A050698 extends SetDifferenceSequence {

  /** Construct the sequence. */
  public A050698() {
    super(new A050695(), new A035139());
  }
}
