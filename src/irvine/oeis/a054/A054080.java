package irvine.oeis.a054;

import irvine.oeis.a001.A001037;
import irvine.oeis.transform.InverseMobiusTransformSequence;

/**
 * A054080 Inverse Moebius transform of A001037 (starting at term 0).
 * @author Sean A. Irvine
 */
public class A054080 extends InverseMobiusTransformSequence {

  /** Construct the sequence. */
  public A054080() {
    super(0, new A001037(), 0);
    next();
  }
}
