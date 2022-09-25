package irvine.oeis.a059;

import irvine.oeis.Combiner;
import irvine.oeis.a002.A002135;

/**
 * A059423 Number of positive terms in a symmetric determinant of order n.
 * @author Sean A. Irvine
 */
public class A059423 extends Combiner {

  /** Construct the sequence. */
  public A059423() {
    super(new A059422(), new A002135(), AVERAGE);
  }
}
