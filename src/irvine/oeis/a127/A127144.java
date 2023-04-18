package irvine.oeis.a127;
// manually interleave at 2023-04-16 13:29

import irvine.math.z.Z;
import irvine.oeis.AlternatingSequence;
import irvine.oeis.a001.A001147;
import irvine.oeis.a126.A126967;

/**
 * A127144 Q(2,n), where Q(m,k) is defined in A127080 and A127137,.
 * @author Georg Fischer
 */
public class A127144 extends AlternatingSequence {

  /** Construct the sequence. */
  public A127144() {
    super(0, new A126967(), new A001147() {
      private int mN = -1;

      {
        super.next();
      }

      @Override
      public Z next() {
        ++mN;
        return ((mN & 1) == 1) ? super.next().negate() : super.next();
      }
    });
  }
}
