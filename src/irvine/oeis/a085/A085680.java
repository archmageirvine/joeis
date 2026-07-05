package irvine.oeis.a085;

import irvine.math.z.Z;

/**
 * A085680 Size of largest code of length n and constant weight 2 that can correct a single adjacent transposition.
 * @author Sean A. Irvine
 */
public class A085680 extends A085684 {

  // Only good for a small number of terms

  private int mN = 1;

  /** Construct the sequence. */
  public A085680() {
    super(2);
  }

  @Override
  public Z next() {
    return Z.valueOf(t(++mN, 2));
  }
}
