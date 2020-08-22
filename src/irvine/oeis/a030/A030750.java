package irvine.oeis.a030;

import irvine.oeis.PositionOfNSequence;

/**
 * A030750 a(n)=least k such that s(k)=n, where s=A030747.
 * @author Sean A. Irvine
 */
public class A030750 extends PositionOfNSequence {

  /** Construct the sequence. */
  public A030750() {
    super(new A030747());
  }
}
