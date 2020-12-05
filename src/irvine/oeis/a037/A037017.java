package irvine.oeis.a037;

import irvine.math.z.Z;
import irvine.oeis.FiniteSequence;

/**
 * A037017 Prime pentadecet homolog of {11,13,17,...,61,67}.
 * @author Sean A. Irvine
 */
public class A037017 extends FiniteSequence {

  private static final long[] OFFSETS = {11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67};
  private static final Z BASE = new Z("1632373745527558118190");

  private static Z[] build() {
    final Z[] res = new Z[OFFSETS.length];
    for (int k = 0; k < OFFSETS.length; ++k) {
      res[k] = BASE.add(OFFSETS[k]);
    }
    return res;
  }

  /** Construct the sequence. */
  public A037017() {
    super(build());
  }
}
