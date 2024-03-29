package irvine.oeis.a115;
// Generated by gen_seq4.pl 2024-02-28/tuptraf at 2024-02-28 22:56

import irvine.oeis.PrependSequence;
import irvine.oeis.a030.A030220;
import irvine.oeis.a136.A136599;
import irvine.oeis.transform.TupleTransformSequence;

/**
 * A115155 Expansion of (eta(q^3) * eta(q^5))^3 + (eta(q) * eta(q^15))^3 in powers of q.
 * @author Georg Fischer
 */
public class A115155 extends TupleTransformSequence {

  /** Construct the sequence. */
  public A115155() {
    super(1, (n, s) -> s[0].add(s[1]), "", new A030220(), new PrependSequence(1, new A136599(), 0));
  }
}
