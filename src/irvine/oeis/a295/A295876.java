package irvine.oeis.a295;
// Generated by gen_seq4.pl 2024-02-22/rgs1 at 2024-02-22 20:18

import irvine.oeis.a023.A023900;
import irvine.oeis.transform.RestrictedGrowthTransformSequence;

/**
 * A295876 Restricted growth sequence transform of A023900, Product_{p|n} (1-p).
 * @author Georg Fischer
 */
public class A295876 extends RestrictedGrowthTransformSequence {

  /** Construct the sequence. */
  public A295876() {
    super(1, new A023900());
  }
}
