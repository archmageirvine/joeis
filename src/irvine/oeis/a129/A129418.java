package irvine.oeis.a129;

import irvine.math.z.Z;
import irvine.oeis.a333.A333330;

/**
 * A129418 Number of isomorphism classes of 4-regular loopless multigraphs of order n.
 * @author Gregory Morse
 */
public class A129418 extends A333330 {
  private final int mDegree;
  private int mN;

  protected A129418(final int degree, final boolean loops, final int offset) {
    super(loops, false);
    mDegree = degree;
    setOffset(offset);
    mN = offset - 1;
  }

  /** Construct the sequence. */
  public A129418() {
    this(4, false, 0);
  }

  @Override
  public Z next() {
    return regular(++mN * ((mDegree & 1) + 1), mDegree);
  }
}
