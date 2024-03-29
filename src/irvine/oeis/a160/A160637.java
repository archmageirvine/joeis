package irvine.oeis.a160;
// Generated by gen_seq4.pl hantraf at 2024-01-19 09:26

import irvine.oeis.a114.A114464;
import irvine.oeis.transform.HankelTransformSequence;

/**
 * A160637 Hankel transform of A114464(n+1).
 * @author Georg Fischer
 */
public class A160637 extends HankelTransformSequence {

  /** Construct the sequence. */
  public A160637() {
    super(0, new A114464().skip(1), 1);
  }
}
