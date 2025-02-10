package irvine.oeis.a075;

import irvine.math.z.Z;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A075172 Number of edges in each rooted plane tree produced with the binary run length unranking algorithm presented in A075171.
 * @author Sean A. Irvine
 */
public class A075172 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A075172() {
    super(1, new A075170(), k -> Z.valueOf(k.bitCount()));
  }
}
