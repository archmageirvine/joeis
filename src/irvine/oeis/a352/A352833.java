package irvine.oeis.a352;
// manually interleave at 2023-04-16 13:29

import irvine.oeis.AlternatingSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a001.A001522;
import irvine.oeis.a064.A064428;

/**
 * A352833 Irregular triangle read by rows where T(n,k) is the number of integer partitions of n with k fixed points, k = 0, 1.
 * @author Georg Fischer
 */
public class A352833 extends AlternatingSequence {

  /** Construct the sequence. */
  public A352833() {
    super(0, new A064428(), new PrependSequence(new A001522().skip(1), 0));
  }
}
