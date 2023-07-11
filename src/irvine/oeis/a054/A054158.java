package irvine.oeis.a054;

import irvine.oeis.a001.A001371;
import irvine.oeis.transform.InverseMobiusTransformSequence;

/**
 * A054158 Inverse Moebius transform of A001371 (starting at term 0).
 * @author Sean A. Irvine
 */
public class A054158 extends InverseMobiusTransformSequence {

  /** Construct the sequence. */
  public A054158() {
    super(0, new A001371(), 0);
    next();
  }
}
