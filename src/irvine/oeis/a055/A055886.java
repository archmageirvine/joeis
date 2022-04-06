package irvine.oeis.a055;

import irvine.oeis.Sequence;

/**
 * A055886 Euler transform applied three times to partition triangle A008284.
 * @author Sean A. Irvine
 */
public class A055886 extends A055884 {

  @Override
  protected Sequence getUnderlyingSequence() {
    return new A055885();
  }
}
