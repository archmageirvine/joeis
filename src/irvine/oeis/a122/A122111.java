package irvine.oeis.a122;
// manually 2024-06-20

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.DirectSequence;
import irvine.oeis.a108.A108951;
import irvine.oeis.a181.A181819;

/**
 * A122111 Self-inverse permutation of the positive integers induced by partition enumeration in A112798 and partition conjugation.
 * Formula: <code>a(n) = A181819(A108951(n)).</code>
 * @author Georg Fischer
 */
public class A122111 extends AbstractSequence implements DirectSequence {

  private static final DirectSequence A181819 = new A181819();
  private static final DirectSequence A108951 = new A108951();

  private int mN;

  /** Construct the sequence. */
  public A122111() {
    super(1);
    mN = 0;
  }

  @Override
  public Z next() {
    return A181819.a(A108951.a(++mN));
  }

  @Override
  public Z a(final Z n) {
    return A181819.a(A108951.a(n));
  }

  @Override
  public Z a(final int n) {
    return A181819.a(A108951.a(n));
  }

}
