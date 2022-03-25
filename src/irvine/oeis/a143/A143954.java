package irvine.oeis.a143;
// manually partsumm/partsum at 2022-03-24 22:32

import irvine.oeis.PartialSumSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a079.A079309;

/**
 * A143954 Number of peaks in the peak plateaux of all Dyck paths of semilength n.
 * @author Georg Fischer
 */
public class A143954 extends PrependSequence {

  /** Construct the sequence. */
  public A143954() {
    super(new PartialSumSequence(new A079309()), 0, 0);
  }
}
