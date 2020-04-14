package irvine.oeis.a030;

import irvine.oeis.PositionOfNSequence;

/**
 * A030780 <code>a(n)</code> is the least k such that <code>A030777(k) = n</code>.
 * @author Sean A. Irvine
 */
public class A030780 extends PositionOfNSequence {

  /** Construct the sequence. */
  public A030780() {
    super(new A030777());
  }
}
