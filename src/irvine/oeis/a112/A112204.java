package irvine.oeis.a112;
// Generated by gen_seq4.pl rootet at 2023-01-21 23:59

import irvine.oeis.a058.A058563;
import irvine.oeis.transform.RootSequence;

/**
 * A112204 McKay-Thompson series of class 63a for the Monster group.
 * <code>T63a = (q*T21A)^(1/3),where T21A = A058563</code>
 * @author Georg Fischer
 */
public class A112204 extends RootSequence {

  /** Construct the sequence. */
  public A112204() {
    super(0, new A058563().skip(1), 1, 3);
  }
}
