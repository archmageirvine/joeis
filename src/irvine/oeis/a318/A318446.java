package irvine.oeis.a318;

import irvine.oeis.a005.A005187;
import irvine.oeis.transform.InverseMobiusTransformSequence;

/**
 * A318446 Inverse Möbius transform of A005187: a(n) = Sum_{d|n} A005187(d).
 * @author Georg Fischer
 */
public class A318446 extends InverseMobiusTransformSequence {

  private int mN = 0;

  /** Construct the sequence. */
  public A318446() {
    super(new A005187(), 1);
    super.next();
  }
}
