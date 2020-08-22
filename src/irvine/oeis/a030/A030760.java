package irvine.oeis.a030;

import irvine.oeis.PositionOfNSequence;

/**
 * A030760 a(n)=least k such that s(k)=n, where s=A030757.
 * @author Sean A. Irvine
 */
public class A030760 extends PositionOfNSequence {

  /** Construct the sequence. */
  public A030760() {
    super(new A030757());
  }
}
