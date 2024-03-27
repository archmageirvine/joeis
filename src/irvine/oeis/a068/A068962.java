package irvine.oeis.a068;

import irvine.math.z.Z;
import irvine.oeis.a028.A028355;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A068962 Number of successive terms of A028356 that add to n; or length of n-th term of A028355.
 * @author Sean A. Irvine
 */
public class A068962 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A068962() {
    super(1, new A028355(), k -> Z.valueOf(k.toString().length()));
  }
}
