package irvine.oeis.a054;

import irvine.oeis.a000.A000029;
import irvine.oeis.transform.InverseMobiusTransformSequence;

/**
 * A054155 Inverse Moebius transform of A000029 (starting at term 0).
 * @author Sean A. Irvine
 */
public class A054155 extends InverseMobiusTransformSequence {

  /** Construct the sequence. */
  public A054155() {
    super(new A000029(), 0);
    next();
  }
}
