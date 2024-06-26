package irvine.oeis.a368;
// Generated by gen_seq4.pl 2024-04-11/simtraf at 2024-04-11 21:12

import irvine.oeis.a324.A324402;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A368068 a(n) = Product_{i=1..n, j=1..n} (2*i^2 + 5*i*j + 2*j^2).
 * @author Georg Fischer
 */
public class A368068 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A368068() {
    super(0, new A324402(), v -> v.square());
  }
}
