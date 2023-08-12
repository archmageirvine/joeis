package irvine.oeis.a065;

import irvine.math.z.Z;
import irvine.oeis.PrependSequence;
import irvine.oeis.a014.A014537;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A065071 Minimum number of identical bricks of length 1 which, when stacked without mortar in the naive way, form a stack of length &gt;=n.
 * @author Sean A. Irvine
 */
public class A065071 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A065071() {
    super(1, new PrependSequence(new A014537(), 0), Z.ONE::add);
  }
}

