package irvine.oeis.a319;

import irvine.oeis.DifferenceSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a122.A122082;

/**
 * A319155 Number of bicolored graphs on 2n unlabled nodes without isolated nodes and which are invariant when the two color classes are interchanged.
 * @author Sean A. Irvine
 */
public class A319155 extends DifferenceSequence {

  /** Construct the sequence. */
  public A319155() {
    super(new PrependSequence(new A122082(), 0));
  }
}
