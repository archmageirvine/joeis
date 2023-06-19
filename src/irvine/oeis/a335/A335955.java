package irvine.oeis.a335;
// manually interleave at 2023-04-16 13:29

import irvine.math.z.Z;
import irvine.oeis.AlternatingSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a002.A002425;
import irvine.oeis.a028.A028296;

/**
 * A335955 a(n) = (4^n*(Z(-n, 1/4) - Z(-n, 3/4)) + Z(-n, 1)*(2^(n+1)-1))*A171977(n+1), where Z(n, c) is the Hurwitz zeta function.
 * @author Georg Fischer
 */
public class A335955 extends AlternatingSequence {

  /** Construct the sequence. */
  public A335955() {
    super(0, new PrependSequence(new A028296().skip(1), 0), new A002425() {
      private int mN = -1;

      @Override
      public Z next() {
        ++mN;
        return ((mN & 1) == 0) ? super.next().negate() : super.next();
      }
    });
  }
}
