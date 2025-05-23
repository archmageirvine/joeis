package irvine.oeis.a077;

import irvine.math.z.Z;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A077467 Sum of binary digits of A077465(n).
 * @author Sean A. Irvine
 */
public class A077467 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A077467() {
    super(1, new A077465(), k -> Z.valueOf(k.bitCount()));
  }
}
