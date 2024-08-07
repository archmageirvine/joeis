package irvine.oeis.a071;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.PrependSequence;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A071157 The zero-free, right-to-left factorial walk encoding for each rooted plane tree encoded by A014486. Sequence A071155 shown with factorial expansion (A007623).
 * @author Sean A. Irvine
 */
public class A071157 extends PrependSequence {

  /** Construct the sequence. */
  public A071157() {
    super(0, new SimpleTransformSequence(1, new A071159(), k -> Functions.REVERSE.z(k)), Z.ZERO);
  }
}
