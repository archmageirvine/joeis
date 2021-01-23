package irvine.oeis.a030;

import irvine.oeis.PositionOfNSequence;

/**
 * A030740 a(n)=least k such that s(k)=n, where s=A030737.
 * @author Sean A. Irvine
 */
public class A030740 extends PositionOfNSequence {

  /** Construct the sequence. */
  public A030740() {
    super(new A030737());
  }
}
