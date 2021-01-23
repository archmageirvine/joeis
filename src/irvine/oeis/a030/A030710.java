package irvine.oeis.a030;

import irvine.oeis.PositionOfNSequence;

/**
 * A030710 a(n)=least k such that s(k)=n, where s=A030707.
 * @author Sean A. Irvine
 */
public class A030710 extends PositionOfNSequence {

  /** Construct the sequence. */
  public A030710() {
    super(new A030707());
  }
}
