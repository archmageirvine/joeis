package irvine.oeis.a059;

import irvine.oeis.Combiner;
import irvine.oeis.a000.A000568;
import irvine.oeis.a002.A002785;

/**
 * A059735 Number of complementary pairs of tournaments on n nodes.
 * @author Sean A. Irvine
 */
public class A059735 extends Combiner {

  /** Construct the sequence. */
  public A059735() {
    super(1, new A000568().skip(1), new A002785(), AVERAGE);
  }
}

