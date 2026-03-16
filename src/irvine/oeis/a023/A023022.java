package irvine.oeis.a023;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a000.A000010;

/**
 * A023022 Number of partitions of n into two relatively prime parts. After initial term, this is the "half-totient" function phi(n)/2 (A000010(n)/2).
 * @author Sean A. Irvine
 */
public class A023022 extends PrependSequence implements DirectSequence {

  /** Construct the sequence. */
  public A023022() {
    super(2, new A000010() {
      @Override
      public Z next() {
        return super.next().divide2();
      }
    }.skip(2), 1);
  }

  @Override
  public Z a(final Z n) {
    return n.compareTo(Z.FOUR) <= 0 ? Z.ONE : Functions.PHI.z(n).divide2();
  }

  @Override
  public Z a(final long n) {
    return n <= 4 ? Z.ONE : Functions.PHI.z(n).divide2();
  }

}
