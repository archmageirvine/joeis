package irvine.oeis.a087;

import irvine.math.z.Z;
import irvine.oeis.InverseSequence;

/**
 * A087566 a(n) = index of the first occurrence of n in A087565, or 0 if n is not a term of A087565.
 * @author Sean A. Irvine
 */
public class A087566 extends InverseSequence {

  /** Construct the sequence. */
  public A087566() {
    super(0, 0, new A087565());
  }

  @Override
  public Z next() {
    if (mN == 2) {
      ++mN;
      return Z.ZERO;
    }
    return super.next();
  }
}
