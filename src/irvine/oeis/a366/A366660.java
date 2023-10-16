package irvine.oeis.a366;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.a024.A024101;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A366575.
 * @author Sean A. Irvine
 */
public class A366660 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A366660() {
    super(1, new A024101().skip(), k -> Z.valueOf(Jaguar.factor(k).omega()));
  }
}

