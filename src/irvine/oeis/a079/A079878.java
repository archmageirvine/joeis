package irvine.oeis.a079;
// Generated by gen_seq4.pl tuptraf/simtraf at 2023-10-28 00:07

import irvine.oeis.a064.A064434;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A079878 a(1)=1, then a(n)=2*a(n-1) if 2*a(n-1)&lt;=n, a(n)=2*a(n-1)-n otherwise.
 * @author Georg Fischer
 */
public class A079878 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A079878() {
    super(1, new A064434(), v -> v.add(1));
  }
}
