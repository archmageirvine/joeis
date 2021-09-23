package irvine.oeis.a051;

import java.io.IOException;

import irvine.math.z.Z;
import irvine.oeis.EuclidMullinSequence;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000040;

/**
 * A051614 4th term in Euclid-Mullin prime sequence started with n-th prime (cf. A000945).
 * @author Sean A. Irvine
 */
public class A051614 extends A000040 {

  @Override
  public Z next() {
    try {
      final Sequence seq = new EuclidMullinSequence(super.next());
      seq.next();
      seq.next();
      seq.next();
      return seq.next();
    } catch (final IOException e) {
      throw new RuntimeException(e);
    }
  }
}
