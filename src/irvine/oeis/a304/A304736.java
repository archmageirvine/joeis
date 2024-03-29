package irvine.oeis.a304;
// Generated by gen_seq4.pl 2024-02-22/rgs1 at 2024-02-22 20:18

import irvine.oeis.a048.A048675;
import irvine.oeis.a064.A064413;
import irvine.oeis.transform.DirectTransformSequence;
import irvine.oeis.transform.RestrictedGrowthTransformSequence;

/**
 * A304736 Restricted growth sequence transform of A048675(A064413(n)).
 * @author Georg Fischer
 */
public class A304736 extends RestrictedGrowthTransformSequence {

  /** Construct the sequence. */
  public A304736() {
    super(1, new DirectTransformSequence(1, new A048675(), new A064413()));
  }
}
