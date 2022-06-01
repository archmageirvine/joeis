package irvine.oeis.a190;

import irvine.oeis.transform.EulerTransformSequence;
import irvine.oeis.recur.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A190101 Number of transpose partition pairs of order n whose number of odd parts differ by numbers of the form 4*k + 2.
 * @author Sean A. Irvine
 */
public class A190101 extends PrependSequence {

  /** Construct the sequence. */
  public A190101() {
    super(new EulerTransformSequence(new PeriodicSequence(1, -1, 1, 4, 1, -1, 1, 2, 1, -1, 1, 4, 1, -1, 1, 3, 1, -1, 1, 4, 1, -1, 1, 2, 1, -1, 1, 4, 1, -1, 1, 1), 0), 0, 0);
  }
}
