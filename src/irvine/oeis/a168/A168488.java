package irvine.oeis.a168;
// Generated by gen_seq4.pl hantraf at 2024-01-19 09:26

import irvine.oeis.a005.A005439;
import irvine.oeis.transform.HankelTransformSequence;

/**
 * A168488 Hankel transform of Genocchi medians.
 * @author Georg Fischer
 */
public class A168488 extends HankelTransformSequence {

  /** Construct the sequence. */
  public A168488() {
    super(0, new A005439(), 1);
  }
}
