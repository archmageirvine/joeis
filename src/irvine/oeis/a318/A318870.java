package irvine.oeis.a318;

import irvine.oeis.PrependSequence;
import irvine.oeis.a007.A007776;

/**
 * A318870 Number of connected bipartite graphs on n unlabeled nodes with a distinguished bipartite block.
 * @author Sean A. Irvine
 */
public class A318870 extends PrependSequence {

  /** Construct the sequence. */
  public A318870() {
    super(new A007776(), 1, 2);
  }
}
