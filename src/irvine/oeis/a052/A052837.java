package irvine.oeis.a052;

import irvine.oeis.PrependSequence;
import irvine.oeis.a048.A048574;

/**
 * A052837 Number of partitions of 2n whose Ferrers-Young diagram allows more than one different domino tiling.
 * @author Sean A. Irvine
 */
public class A052837 extends PrependSequence {

  /** Construct the sequence. */
  public A052837() {
    super(new A048574(), 0, 0);
  }
}
