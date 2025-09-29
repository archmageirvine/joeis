package irvine.oeis.a388;

import irvine.math.z.Z;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A388974 a(n) = log_2(A388973(n)).
 * @author Sean A. Irvine
 */
public class A388974 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A388974() {
    super(1, new A388973(), k -> Z.valueOf(k.makeOdd().auxiliary()));
  }
}

