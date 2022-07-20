package irvine.oeis.a058;

import irvine.oeis.MultiplicativeSequence;

/**
 * A058035 Largest 4th-power-free number dividing n.
 * @author Sean A. Irvine
 */
public class A058035 extends MultiplicativeSequence {

  /** Construct the sequence. */
  public A058035() {
    super(1, (p, e) -> p.pow(Math.min(3, e)));
  }
}
