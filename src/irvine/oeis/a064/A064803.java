package irvine.oeis.a064;

import irvine.math.z.Integers;
import irvine.oeis.MultiplicativeSequence;

/**
 * A064803 Number of subgroups of the group C_n X C_n X C_n (where C_n is the cyclic group of order n).
 * @author Sean A. Irvine
 */
public class A064803 extends MultiplicativeSequence {

  /** Construct the sequence. */
  public A064803() {
    super(1, (p, e) -> Integers.SINGLETON.sum(0, 2 * e, j -> p.pow(2L * e - j).multiply(2L * j - (j == 0 ? -1 : (j - 1) / 2)).multiply(e - (j == 0 ? -1 : (j - 1) / 2))));
  }
}

