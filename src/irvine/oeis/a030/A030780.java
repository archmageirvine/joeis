package irvine.oeis.a030;

import irvine.oeis.PositionOfNSequence;

/**
 * A030780 a(n) is the least k such that A030777(k) = n.
 * @author Sean A. Irvine
 */
public class A030780 extends PositionOfNSequence {

  /** Construct the sequence. */
  public A030780() {
    super(new A030777());
  }
}
