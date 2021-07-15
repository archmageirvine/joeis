package irvine.oeis.a048;

import irvine.oeis.PositionOfNSequence;

/**
 * A048822 a(n) = least k such that A048821(k) = n.
 * @author Sean A. Irvine
 */
public class A048822 extends PositionOfNSequence {

  /** Construct the sequence. */
  public A048822() {
    super(new A048821(), 1, 0);
  }
}

