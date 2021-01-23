package irvine.oeis.a108;

import irvine.oeis.InverseMobiusTransformSequence;
import irvine.oeis.a000.A000045;

/**
 * A108046 Inverse Moebius transform of Fibonacci numbers 0, 1, 1, 2, 3, 5, 8, ...
 * @author Sean A. Irvine
 */
public class A108046 extends InverseMobiusTransformSequence {

  /** Construct the sequence. */
  public A108046() {
    super(new A000045(), 0);
    next();
  }
}
