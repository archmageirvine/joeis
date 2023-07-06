package irvine.oeis.a007;

import irvine.oeis.Combiner;
import irvine.oeis.a000.A000088;
import irvine.oeis.a000.A000171;

/**
 * A007869 Number of complementary pairs of graphs on n nodes. Also number of unlabeled graphs with n nodes and an even number of edges.
 * @author Sean A. Irvine
 */
public class A007869 extends Combiner {

  /** Construct the sequence. */
  public A007869() {
    super(1, new A000088().skip(1), new A000171(), AVERAGE);
  }
}
