package irvine.oeis.a046;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.PrependSequence;

/**
 * A046814 Row sums of triangle A046527.
 * @author Sean A. Irvine
 */
public class A046814 extends PrependSequence {

  /** Construct the sequence. */
  public A046814() {
    super(new A046714(), 0);
  }

  private long mN = -1;

  @Override
  public Z next() {
    final long n = ++mN;
    return super.next().add(Functions.CATALAN.z(n));
  }
}
