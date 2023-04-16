package irvine.oeis.a290;
// manually interleave at 2023-04-16 16:45

import irvine.math.z.Z;
import irvine.oeis.AlternatingSequence;
import irvine.oeis.a004.A004013;
import irvine.oeis.a045.A045828;

/**
 * A290705 Theta series of triamond.
 * @author Georg Fischer
 */
public class A290705 extends AlternatingSequence {

  /** Construct the sequence. */
  public A290705() {
    super(0, new A004013(), new A045828() {
      @Override
      public Z next() {
        return super.next().multiply(3);
      }
    });
  }
}
