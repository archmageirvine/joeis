package irvine.oeis.a390;

import irvine.math.z.Z;
import irvine.oeis.a392.A392686;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A390227 a(n) = A392686(n)/2.
 * @author Sean A. Irvine
 */
public class A390227 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A390227() {
    super(0, new A392686(), Z::divide2);
  }
}
