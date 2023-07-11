package irvine.oeis.a054;

import irvine.oeis.a000.A000031;
import irvine.oeis.transform.MobiusTransformSequence;

/**
 * A054079 Moebius transform of A000031 (starting at term 0).
 * @author Sean A. Irvine
 */
public class A054079 extends MobiusTransformSequence {

  /** Construct the sequence. */
  public A054079() {
    super(0, new A000031(), 0);
    next();
  }
}
