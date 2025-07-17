package irvine.oeis.a386;

import irvine.oeis.a000.A000108;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A381847.
 * @author Sean A. Irvine
 */
public class A386291 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A386291() {
    super(0, new A000108(), k -> k.add(1).multiply(k).multiply2());
  }
}

