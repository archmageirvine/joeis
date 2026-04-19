package irvine.oeis.a084;

import irvine.math.z.Z;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A084484 a(n) = A007088(A084483(n)).
 * @author Sean A. Irvine
 */
public class A084484 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A084484() {
    super(new A084483(), k -> new Z(k.toString(2)));
  }
}
