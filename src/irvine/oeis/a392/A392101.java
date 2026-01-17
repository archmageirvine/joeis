package irvine.oeis.a392;

import irvine.math.z.Z;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A392101 Numbers whose square is the concatenation of two or more powers of 2.
 * @author Sean A. Irvine
 */
public class A392101 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A392101() {
    super(1, new A392102(), Z::sqrt);
  }
}

