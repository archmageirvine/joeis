package irvine.oeis.a193;

import irvine.oeis.PartialSumSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a052.A052910;

/**
 * A193641 Number of arrays of -1..1 integers x(1..n) with every x(i) in a subsequence of length 1 or 2 with sum zero.
 * @author Sean A. Irvine
 */
public class A193641 extends PrependSequence {

  /** Construct the sequence. */
  public A193641() {
    super(1, new PartialSumSequence(new A052910()), 1);
  }
}
