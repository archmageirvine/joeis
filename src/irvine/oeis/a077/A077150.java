package irvine.oeis.a077;
// Generated by gen_seq4.pl 2023-12-27/simtraf at 2023-12-27 11:35

import irvine.factor.prime.Puma;
import irvine.oeis.a000.A000010;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A077150 Number of composite numbers between n and 2n that are coprime to n.
 * @author Georg Fischer
 */
public class A077150 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A077150() {
    super(1, new A000010(), (n, v) -> v.add(Puma.primePiZ(n)).subtract(Puma.primePiZ(2 * n)));
  }
}
