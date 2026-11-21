package irvine.oeis.a339;

import irvine.oeis.transform.PairTransformSequence;

/**
 * A339295 Number of essentially parallel unoriented series-parallel networks with n elements and without multiple unit elements in parallel.
 * @author Gregory Morse
 */
public class A339295 extends PairTransformSequence {
  /** Construct the sequence. */
  public A339295() {
    super(1, new A339289(), new A339292(), (n, u, v) -> u.add(v).divide2());
  }
}
