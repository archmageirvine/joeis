package irvine.oeis.a190;

import irvine.oeis.EulerTransformSequence;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A190101 Number of transpose partition pairs of order n whose number of odd parts differ by numbers of the form <code>4*k + 2</code>.
 * @author Sean A. Irvine
 */
public class A190101 extends PrependSequence {

  /** Construct the sequence. */
  public A190101() {
    super(new EulerTransformSequence(new PeriodicSequence(1, -1, 1, 4, 1, -1, 1, 2, 1, -1, 1, 4, 1, -1, 1, 3, 1, -1, 1, 4, 1, -1, 1, 2, 1, -1, 1, 4, 1, -1, 1, 1), 0), 0, 0);
  }
}
