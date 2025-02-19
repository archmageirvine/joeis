package irvine.oeis.a075;

import irvine.math.z.Z;
import irvine.oeis.a159.A159257;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A075462 a(n) is the number of solutions to the all-ones lights out problem on an n X n square.
 * @author Sean A. Irvine
 */
public class A075462 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A075462() {
    super(1, new A159257(), k -> Z.ONE.shiftLeft(k.longValueExact()));
  }
}
