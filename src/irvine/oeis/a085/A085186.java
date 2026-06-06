package irvine.oeis.a085;

import irvine.math.z.Z;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A085186 Sequence A085195 shown in base 4.
 * @author Sean A. Irvine
 */
public class A085186 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A085186() {
    super(0, new A085195(), k -> new Z(k.toString(4)));
  }
}
