package irvine.oeis.a030;

import irvine.oeis.PositionOfNSequence;

/**
 * A030790 a(n)=least k such that s(k)=n, where s=A030787.
 * @author Sean A. Irvine
 */
public class A030790 extends PositionOfNSequence {

  /** Construct the sequence. */
  public A030790() {
    super(new A030787());
  }
}
