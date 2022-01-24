package irvine.oeis.a054;

import irvine.oeis.a001.A001371;
import irvine.oeis.transform.MobiusTransformSequence;

/**
 * A054160 Moebius transform of A001371 (starting at term 0).
 * @author Sean A. Irvine
 */
public class A054160 extends MobiusTransformSequence {

  /** Construct the sequence. */
  public A054160() {
    super(new A001371(), 0);
    next();
  }
}
