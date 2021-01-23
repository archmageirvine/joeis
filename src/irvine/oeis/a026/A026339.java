package irvine.oeis.a026;

import irvine.oeis.PositionOfNSequence;

/**
 * A026339 a(n) = least k such that s(k) = n, where s = A026338.
 * @author Sean A. Irvine
 */
public class A026339 extends PositionOfNSequence {

  /** Construct the sequence. */
  public A026339() {
    super(new A026338());
  }
}
