package irvine.oeis.a055;

import irvine.oeis.Sequence;

/**
 * A055885 Euler transform applied twice to partition triangle A008284.
 * @author Sean A. Irvine
 */
public class A055885 extends A055884 {

  @Override
  protected Sequence getUnderlyingSequence() {
    return new A055884();
  }
}
