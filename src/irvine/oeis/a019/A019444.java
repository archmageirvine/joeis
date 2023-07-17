package irvine.oeis.a019;

import irvine.math.z.Z;
import irvine.oeis.a002.A002251;

/**
 * A019444 a_1, a_2, ..., is a permutation of the positive integers such that the average of each initial segment is an integer, using the greedy algorithm to define a_n.
 * @author Sean A. Irvine
 */
public class A019444 extends A002251 {

  /** Construct the sequence. */
  public A019444() {
    super(1);
  }

  @Override
  public Z next() {
    return super.next().add(1);
  }
}
